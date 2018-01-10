package cn.msosm.shop.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONObject;

import cn.msosm.shop.model.ResultModel;
import cn.msosm.shop.service.PictureService;
import cn.msosm.shop.utils.FastDFSClient;

@Service
public class PictureServiceImpl implements PictureService {


	@Value("${IMAGE_SERVER_URL}")
	private String IMAGE_SERVER_URL;
	
	
	public ResultModel picUpload(MultipartFile file) {
		try { 
			if(file==null) { 
				return ResultModel.build(500, "图片上传失败");
			} 
			//接收上传的文件
			//取扩展名
			String originalFilename = file.getOriginalFilename();
			String extName = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);
			//上传到图片服务器
			FastDFSClient fastDFSClient = new FastDFSClient("classpath:resource/client.conf");
			String url = fastDFSClient.uploadFile(file.getBytes(), extName);
			url = IMAGE_SERVER_URL + url;
			//响应上传图片的url
			Map<String,Object> result = new HashMap<String,Object>(); 
			result.put("url", url);
			return ResultModel.build(200, "图片上传成功",result);
		} catch (Exception e) {
			e.printStackTrace();
			Map<String,Object> result = new HashMap<String,Object>();
			result.put("status", 1);
			result.put("msg", "图片上传失败");
			return ResultModel.build(500, "图片上传失败");
		}

	}

}
