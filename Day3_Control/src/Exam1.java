import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("첫번째 숫자 입력 :");
		int first_number =Integer.parseInt(sc.nextLine());
		System.out.println("두번째 숫자 입력 :");
		int second_number =Integer.parseInt(sc.nextLine());
		
		if (first_number>second_number) {
			
			System.out.println("=======결과=======");
			System.out.println("첫번째 값이 더 큽니다");
			
		}else if (first_number<second_number) {
			
			System.out.println("=======결과=======");
			System.out.println("두번째 값이 더 큽니다");
			
		}else {
			
			System.out.println("값이 같습니다");
		}
		
		
	}
	
}
