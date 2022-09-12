import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

public class Server {
   public static void main(String[] args) throws Exception{
      

      ServerSocket server =new ServerSocket(25000);
      System.out.println("클라이언트의 연결을 대기 중 입니다 ...");
      Socket sock = server.accept();//실행되는 즉시 무한루프를 통해 ram을 감시.25000번이 들어오면 그대로 멈춤.

      System.out.println(sock.getInetAddress()+"로 부터 연결 확인!");

      OutputStream os = sock.getOutputStream(); //socket으로 부터 데이터를 내보냄 (아주 기초상태라 보낼수있는 자료형이 별로없음)
      DataOutputStream dos = new DataOutputStream(os); // 기본stream보다 업그레이드된 상태

      while(true) {
         System.out.print("서버가 클라이언트에게 보내고 싶은 메세지 : ");
         dos.writeUTF(JOptionPane.showInputDialog("메세지 입력"));
          //write는 바로 전송 x 버퍼에만 저장해놓음 
         dos.flush();           //버퍼에있는 데이터 전송기능    
      }
   }
}