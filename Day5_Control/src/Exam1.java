import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("apple 을 입력하세요 : ");
		String str = sc.nextLine();
		
		if (str.equals ("apple")) {
				
			System.out.println("정답");
			
		}else {
			
			System.out.println("apple 을 입력해주세요");
			
		}
		
		
	}
}
