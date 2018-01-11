import java.io.IOException;

import org.csource.common.MyException;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.junit.Test;

import cn.msosm.shop.utils.FastDFSClient;

public class TestFastDFS {

	
	@Test
	public void uploadFile() throws Exception{
		
		//加载配置文件	
		ClientGlobal.init("G:/learn/FastDfs/src/main/resources/resource/client.conf");
		//创建一个TrackerClient对象
		TrackerClient trackerClient = new TrackerClient();
		//使用TrackerClient对象获得trackerServer对象
		TrackerServer trackerServer = trackerClient.getConnection();
		//创建一个StorageServer的引用 null就可以
		StorageServer storageServer = null;
		//创建一个storageClient对象 trackerServer, storageServer两个参数
		StorageClient storageClient = new StorageClient(trackerServer, storageServer);
		 //使用storageClient上传图片
		String[] strings = storageClient.upload_file("D:/Documents/Pictures/563757.jpg", "jpg", null);
		for (String string : strings) {
			System.out.println(string);
		}
		 
		
	}
 
	
	
	
	
	
	
	
	@Test
	public void FastDFSClientTest() throws Exception {
		FastDFSClient dfsClient = new FastDFSClient("G:/learn/FastDfs/src/main/resources/resource/client.conf");
		String filePath = dfsClient.uploadFile("D:/Documents/Pictures/563764.jpg");
		System.out.println("filePath-->"+filePath);
		
	}
	
	
	
	@Test
	public void deleFileTest()  throws Exception {
		//0:文件删除成功，2：文件不存在 ，其它：文件删除出错；
		FastDFSClient dfsClient = new FastDFSClient("G:/learn/FastDfs/src/main/resources/resource/client.conf");
		int count = dfsClient.deleteFile("group1", "M00/00/00/wKgAUlpXEwuAegixAAKpVDiozsk415.jpg");
		System.out.println(count);
	}
	
	
	
	
	
	
}
