import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("당신이 좋아하는 과목은?");
		System.out.println("1.java 2.음악 3. 과학");
		System.out.println(">> :");
		
		int num = Integer.parseInt(sc.nextLine());
		switch (num) {
		
		case 1: 
			System.out.println("java");
			
			break;
		case 2:	
			System.out.println("music");
			
			break;
		case 3: 
			System.out.println("science");
			
			break;

		default: System.out.println("null");
			
			break;
		}
		
	}
}
