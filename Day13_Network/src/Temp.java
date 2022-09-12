import java.sql.Date;
import java.text.SimpleDateFormat;

public class Temp {
	public static void main(String[] args) throws Exception {
		// 현재 시각을 출력하는 방법
		
		// epoch time - 1970.1.1 0시
		System.out.print("time stamp : ");
		System.out.println(System.currentTimeMillis()); 
		// time stamp
		// epoch time 으로 부터 현재까지 흐른시간을 초(밀리초)값으로 표현한 값
		System.out.print("date : ");
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		// time stamp 의 값을 원하는 형태로 변경해주는 클래스
		// yyyy.MM.dd.hh.mm.ss
		System.out.println(date.format(System.currentTimeMillis()));
		
		
		System.out.print("time : ");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss");
		System.out.println(time.format(System.currentTimeMillis()));
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		java.util.Date result = sdf.parse("2010/12/25 14:00:00");
		System.out.println("2010/12/25 14:00:00 시간의 time stamp 값");
		System.out.println(result.getTime()); 
		
		System.out.println(sdf.format(result.getTime()));
		
	}
}
