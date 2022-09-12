import java.util.Scanner;

public class Exam1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());

		// 구구단 
		//입력값 n 의 대한 구구단 실행
		
		int i =1;
		while(i<10) {
			System.out.println(n+"*"+i+"="+n*i);
			i++;
		}
	}
}
