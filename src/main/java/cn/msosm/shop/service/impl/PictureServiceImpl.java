package cn.msosm.shop.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSONObject;

import cn.msosm.shop.mapper.MyImgMapper;
import cn.msosm.shop.model.ResultModel;
import cn.msosm.shop.pojo.MyImg;
import cn.msosm.shop.service.PictureService;
import cn.msosm.shop.utils.FastDFSClient;
import cn.msosm.shop.utils.UUIDUtils;

@Service
public class PictureServiceImpl implements PictureService {

	@Autowired
	private MyImgMapper myImgMapper;

	@Value("${IMAGE_SERVER_URL}")
	private String IMAGE_SERVER_URL;

	public ResultModel picUpload(MultipartFile file) {
		try {
			if (file == null) {
				return ResultModel.build(500, "图片上传失败");
			}
			// 接收上传的文件
			// 取扩展名
			String originalFilename = file.getOriginalFilename();
			String extName = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);
			// 上传到图片服务器
			FastDFSClient fastDFSClient = new FastDFSClient("classpath:resource/client.conf");
			String url = fastDFSClient.uploadFile(file.getBytes(), extName);
			String uuId = UUIDUtils.getUUid();
			if (!StringUtils.isEmpty(url)) {
				// 如果上传成功以后 把记录添加到数据中
				MyImg record = new MyImg();
				record.setUuid(uuId);
				String first = url.substring(0, url.indexOf("/"));
				record.setGroups(first);
				int one = url.indexOf("/");
				String imgUrl = url.substring((one + 1), url.length());
				record.setUrl(imgUrl);
				record.setExtname(extName);
				record.setOldname(originalFilename);
				url = IMAGE_SERVER_URL + url;
				record.setImgurl(url);
				myImgMapper.insertSelective(record);
			}

			// 响应上传图片的url
			Map<String, Object> result = new HashMap<String, Object>();
			result.put("url", url);
			result.put("imgId", uuId);
			return ResultModel.build(200, "图片上传成功", result);
		} catch (Exception e) {
			e.printStackTrace();
			Map<String, Object> result = new HashMap<String, Object>();
			result.put("status", 1);
			result.put("msg", "图片上传失败");
			return ResultModel.build(500, "图片上传失败");
		}

	}

	// public static void main(String[] args) {
	// String url = "group1/M00/00/00/wKgAUlpW2neAdxmzAAQDqQllXLQ113.jpg";
	// String first = url.substring(0, url.indexOf("/"));
	// System.out.println(first);
	//
	// String test="group1/M00/00/00/wKgAUlpW2neAdxmzAAQDqQllXLQ113.jpg";
	// int one = test.indexOf("/");
	// System.out.println(test.substring((one+1),test.length()));
	//
	// }

	public ResponseEntity<byte[]> download(String imgId) {
		MyImg img = myImgMapper.selectByPrimaryKey(imgId);
		if (img != null) {
			String groupName = img.getGroups();
			String remoteFileName = img.getUrl();
			String specFileName = img.getOldname();
			byte[] content = null;
			HttpHeaders headers = new HttpHeaders();
			try {
				FastDFSClient fastDFSClient = new FastDFSClient("classpath:resource/client.conf");
				content = fastDFSClient.downFile(groupName, remoteFileName);
				headers.setContentDispositionFormData("attachment",
						new String(specFileName.getBytes("UTF-8"), "iso-8859-1"));
				headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new ResponseEntity<byte[]>(content, headers, HttpStatus.CREATED);

		}
		return null;

	}

	public ResultModel deleteFile(String imgId) {
		try {
			FastDFSClient fastDFSClient = new FastDFSClient("classpath:resource/client.conf");
			MyImg img = myImgMapper.selectByPrimaryKey(imgId);
			if(img!=null) {
				int count = fastDFSClient.deleteFile(img.getGroups(), img.getUrl());
				if(count==0) {
					int result = myImgMapper.deleteByPrimaryKey(imgId);
					if(result>0) {
						return ResultModel.build(200, "删除成功");
					} 
				}else {
					return ResultModel.build(500, "删除失败");
				}
			} else {
				return ResultModel.build(500, "文件不存在");
			} 
		} catch (Exception e) { 
			e.printStackTrace();
		} 
		return ResultModel.build(500, "删除文件异常，重试");
	}

}
