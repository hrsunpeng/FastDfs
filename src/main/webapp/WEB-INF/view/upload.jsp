<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/jsp/tag.jsp"%>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
	<head>
		<meta charset="utf-8" />
		<title>文件上传</title> 
		
		<!-- basic styles -->

		<link href="${baseurl}assets/css/bootstrap.min.css" rel="stylesheet" />
		<link rel="stylesheet" href="${baseurl}assets/css/font-awesome.min.css" />

		  
		<link rel="stylesheet" href="${baseurl}assets/css/dropzone.css" />

		<!-- fonts -->

		<link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400,300" />

		<!-- ace styles -->
 
		<link rel="stylesheet" href="${baseurl}assets/css/ace.min.css" />
		<link rel="stylesheet" href="${baseurl}assets/css/ace-rtl.min.css" />
		<link rel="stylesheet" href="${baseurl}assets/css/ace-skins.min.css" />
 
		<script src="${baseurl}assets/js/ace-extra.min.js"></script>
 
	</head>

	<body>
		 

		<div class="main-container" id="main-container">
			<script type="text/javascript">
				try{ace.settings.check('main-container' , 'fixed')}catch(e){}
			</script>

			<div class="main-container-inner">
				 <div class="page-content"> 
						<div class="row">
							<div class="col-xs-12">
								<!-- PAGE CONTENT BEGINS -->
								<div id="dropzone">
									<form action="/" class="dropzone" method="post" enctype="multipart/form-data">
										<div class="fallback">
											<input name="file" type="file" multiple="" />
										</div>
									</form>
								</div><!-- PAGE CONTENT ENDS -->
							</div><!-- /.col -->
						</div><!-- /.row -->
					</div><!-- /.page-content --> 
			</div><!-- /.main-container-inner -->
 			
 			<img alt="示例图片" id="myImage" src="${baseurl}assets/images/gallery/image-1.jpg" style="width: 200px;height: 200px;">  
 
 
		</div><!-- /.main-container --> 
		<script src="${baseurl}assets/js/jquery-2.0.3.min.js"></script>
  
		<script type="text/javascript">
			window.jQuery || document.write("<script src='${baseurl}assets/js/jquery-2.0.3.min.js'>"+"<"+"/script>");
		</script>
 

		<script type="text/javascript">
			if("ontouchend" in document) document.write("<script src='${baseurl}assets/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
		</script>
		<script src="${baseurl}assets/js/bootstrap.min.js"></script>
		<script src="${baseurl}assets/js/typeahead-bs2.min.js"></script>

		<!-- page specific plugin scripts -->

		<script src="${baseurl}assets/js/dropzone.min.js"></script>

		<!-- ace scripts -->

		<script src="${baseurl}assets/js/ace-elements.min.js"></script>
		<script src="${baseurl}assets/js/ace.min.js"></script>

		<!-- inline scripts related to this page -->
 
 
 
		<script type="text/javascript">
 
		
		
			jQuery(function($){ 
			try {
			  $(".dropzone").dropzone({
			    paramName: "file", // 用于传递文件的名称。
			    maxFiles:10,//一次性上传的文件数量上限
		        maxFilesize: 20, //MB
				addRemoveLinks : true,
				dictDefaultMessage :
				'<span class="bigger-150 bolder"><i class="icon-caret-right red"></i> 拖拽 </span> 上传文件  \ <span class="smaller-80 grey">(或者点击)</span> <br /> \ <i class="upload-icon icon-cloud-upload blue icon-3x"></i>',
				dictMaxFilesExceeded: "您最多只能上传10个文件！",
		        dictResponseError: '文件上传失败!',
		        dictInvalidFileType: "你不能上传该类型文件,文件类型只能是*.jpg,*.gif,*.png。",
		        dictFallbackMessage:"浏览器不受支持",
		        dictFileTooBig:"文件过大上传文件最大支持.",
				url: "pic/upload",
		        method:"post",  //也可用put
		        addRemoveLinks: true,
		        dictRemoveLinks: "x",
		        dictCancelUpload: "x",
		        maxFiles: 10,
		        maxFilesize: 5,
		        acceptedFiles: ".jpg,.png,.gif,.bmp,.jpeg,.JPG,.PNG,.GIF,.BMP,.JPEG", 
		        init: function() {
		        	 this.on("success", function(file, res) {
		        		 //将json字符串转换成json对象  
		        		 var imgUrl = res.data.url;
		        		  console.log(imgUrl);
		        		 document.getElementById("myImage").src=imgUrl;
		        		 
		                 console.log("File " + file.name + "   uploaded");
		                   
		             });
		        	 this.on("removedfile", function(file) {
		                 console.log("File " + file.name + "removed");
		             });
	                 
		        }
		   
			  });
			} catch(e) {
			  alert('Dropzone.js 不支持旧浏览器!');
			}
			
			});
		</script>
 </body>
</html>