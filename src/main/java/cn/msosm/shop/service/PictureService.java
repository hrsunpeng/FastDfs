package cn.msosm.shop.service;

import org.springframework.web.multipart.MultipartFile;

import cn.msosm.shop.model.ResultModel;

public interface PictureService {
	
	public ResultModel picUpload( MultipartFile file ) ;
}
