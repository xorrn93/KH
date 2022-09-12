package Quiz2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

// 192.168.50.65
public class Server {
	public static void main(String[] args) throws Exception{
		
		ServerSocket server = new ServerSocket(23000);
		Socket client = server.accept();
		System.out.println(client.getInetAddress()+"로 연결");
		
		DataInputStream dis = new DataInputStream(client.getInputStream());
		DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		
		String arr[] = new String[] {
				"test1","test1"
		};
		
		String id = dis.readUTF();
		String pswd = dis.readUTF();
		
		arr[0]= id;
		arr[1]= pswd;
		
		if (id.equals(arr[0]) && pswd.equals(arr[1])) {
			dos.writeBoolean(true);
			dos.flush();
		} else {
			dos.writeBoolean(false);
			dos.flush();
		}

	}
}
