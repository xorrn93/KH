import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import it.sauronsoftware.ftp4j.FTPAbortedException;
import it.sauronsoftware.ftp4j.FTPClient;
import it.sauronsoftware.ftp4j.FTPDataTransferException;
import it.sauronsoftware.ftp4j.FTPException;
import it.sauronsoftware.ftp4j.FTPFile;
import it.sauronsoftware.ftp4j.FTPIllegalReplyException;
import it.sauronsoftware.ftp4j.FTPListParseException;

public class FTP_Client {
	public static void main(String[] args) throws IllegalStateException, IOException, FTPIllegalReplyException, FTPException, FTPDataTransferException, FTPAbortedException, FTPListParseException {
		
		FTPClient client = new FTPClient();
		
		Scanner sc = new Scanner(System.in);
		
		menu: while(true) {
			
			try {
				System.out.println("=== FTP Client Program ===");
				System.out.println("1. Connect FTP Server");
				System.out.println("2. Exit Program");
				System.out.println(" >> ");
				
				int input1 = Integer.parseInt(sc.nextLine());
				
				if(input1 == 1) {
					try {
							System.out.println("input url");
							String url = sc.nextLine();
							System.out.println("input port");
							int port = Integer.parseInt(sc.nextLine());
							client.connect(url,port);
							System.out.println("FTP Server is connected ! ");
							System.out.print("input id :");
							String id = sc.nextLine();
							System.out.print("input password :");
							String pd = sc.nextLine();
							client.login(id, pd);
							System.out.println("login Sucess!");
							Start: while(true) {
								System.out.println("1. Upload File");
								System.out.println("2. Download File");
								System.out.println("3. Disconnect FTP Server");
								System.out.println("4. Delete File");
								System.out.println(" >> ");
								
								int input2 = Integer.parseInt(sc.nextLine());
								
								
								switch (input2) {
									case 1:
										System.out.println("Enter Upload File name");
										System.out.print(" >> ");
										client.upload(new File(sc.nextLine())); 
										System.out.println("Sucess Upload !");
										
										break Start;
									case 2:
										
										System.out.println("Choose File");
										FTPFile[] list = client.list();
										for (int i = 0; i < list.length; i++) {
											System.out.println(list[i]);
										}
										System.out.println("Enter Download Path and File Name");
										System.out.print(" File >> ");
										String file = sc.nextLine();
										System.out.print(" Path >> ");
										File path = new File(sc.nextLine());
										
										client.download(file, path);
										break Start;
									case 3:
										
										System.out.println("Disconnect FTP Server...");
										client.disconnect(true);
										break menu;
									case 4:
															
										System.out.println("Enter Delete File Name");
										System.out.print(" File >> ");
										String dfile = sc.nextLine();
										client.deleteFile(sc.nextLine());
										break Start;
			
			
									default:
										System.out.println("Input value is invalid");
										continue;
									}
							
							}
						
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("Input value is invalid");
					}
					
					
					
					
					
				}else if(input1 == 2) {
					System.out.println("Exit Program..");
					System.exit(0);
				}else {
					System.out.println("Please Choose 1 or 2 !!");
				}

			} catch (Exception e) {
				System.out.println("Input value is invalid");
			}
		}
	}
}
