package cn.msosm.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import cn.msosm.shop.model.ResultModel;
import cn.msosm.shop.service.PictureService;

/**
 * 图片上传
 * 
 * @author sunp
 *
 */
@Controller
public class PictureController {

	@Autowired
	private PictureService pictureService;
	
	
	@RequestMapping("/upload") 
	public Object upload() {
		return "upload";
	}
	  
	
	@RequestMapping("/pic/upload") 
	@ResponseBody
	public ResultModel picUpload(@RequestParam("file")  MultipartFile file ) {
		ResultModel result = pictureService.picUpload(file);
		return result;
	}

}
