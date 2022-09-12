import java.util.Iterator;

public class Exam7 {
	public static void main(String[] args) {
		
		int i;
		
		for(i=1;i<=10;i++) {
			
			if(i==2 || i==5) {
				continue;
			}
			System.out.println("i="+i);
			// 출력이 먼저 있기때문에 
			// 출력 먼저 하고 break 됨
			if(i==8) {
				break;
			}
	}
}}
