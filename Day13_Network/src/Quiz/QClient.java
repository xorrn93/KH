package Quiz;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import javax.swing.JOptionPane;

public class QClient {
	public static void main(String[] args)  {
		try (
				Socket client = new Socket("192.168.50.28",25000);
				
				InputStream is = client.getInputStream();
				DataInputStream dis = new DataInputStream(is);
				
				OutputStream os = client.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);
				// close 할수 있는 개체만 들어갈 수 있음
				 
				){
			
			while (true) {
				
				dos.writeUTF(JOptionPane.showInputDialog("메세지 입력 :")); // UTF 방식으로 인코딩 되어 전송
				dos.flush();
				
				String msg= dis.readUTF();// 매개변수가 필요없음
				System.out.println("결과 : "+msg);
			}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Disconnect Server");
			}	
	}
}
