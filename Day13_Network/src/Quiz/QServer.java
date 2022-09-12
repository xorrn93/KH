package Quiz;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;

public class QServer {
	public static void main(String[] args) throws Exception{
		ServerSocket server = new ServerSocket(25000);
		
		System.out.println(" 클라이언트의 연결을 대기중 입니다");
		Socket sock = server.accept();
		
		System.out.println(sock.getInetAddress()+"로 부터 연결을 확인했습니다");
		
		OutputStream os = sock.getOutputStream(); //socket으로 부터 데이터를 내보냄 (아주 기초상태라 보낼수있는 자료형이 별로없음)
	    DataOutputStream dos = new DataOutputStream(os); // 기본stream보다 업그레이드된 상태
	    
		InputStream is = sock.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		
		String msg= dis.readUTF();
		


	    while (true) {
			if (msg.equals("date")) {
				
				long date = System.currentTimeMillis();
				SimpleDateFormat sdf = new SimpleDateFormat("yy년 MM월 dd일 hh시mm분ss초");
				dos.writeUTF(sdf.format(date));
				dos.flush();
				
			}
			else if(msg.equals("lotto")) {
				// 로또번호 생성
				  int[] arr = new int[45];
	               for(int i = 0;i < 45;i++) {arr[i] = i+1;}

	               for(int i = 0;i < arr.length*10;i++) {
	                  int x = (int)(Math.random()*45);
	                  int y = (int)(Math.random()*45);
	                  int tmp = arr[x];
	                  arr[x] = arr[y];
	                  arr[y] = tmp;
	               }
	               
	               for (int i = 0; i < 6; i++) {
	            	   dos.write(arr[i]);
	            	   dos.flush();
				}
	               
				
			}
			else if(msg.equals("wiseword")) {
				// 3가지 명언중의 하나 출력
				int rd = (int)((Math.random()*3)+1);
				if (rd == 1) {
					dos.writeUTF("마누라랑 자식빼고 다 바꿔라");
					dos.flush();
				}else if(rd == 2) {
					dos.writeUTF("바람은 거스르는것이 아니라 다스리는 것이다");
					dos.flush();
				}else {
					dos.writeUTF("4달라!");
					dos.flush();
					
				}
				
				
			}
			
			else {
				dos.writeUTF("결과 : 그런 명령은 없습니다.");
				dos.flush();
			}
		}
		
	}
}
