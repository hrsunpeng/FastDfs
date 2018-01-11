package cn.msosm.shop.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import cn.msosm.shop.model.ResultModel;

public interface PictureService {
	
	public ResultModel picUpload( MultipartFile file ) ;
	
	
	public  ResponseEntity<byte[]> download(String imgId);
	
	public ResultModel deleteFile(String imgId);
	
}
