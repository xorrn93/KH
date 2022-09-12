import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자 입력: ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("두번째 숫자 입력: ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		System.out.println("==== 결과 ====");
		
		if (num1>num2) {
			System.out.println("첫번째 값이 더 큽니다.");
		}else if(num2>num1){
			System.out.println("두번째 값이 더 큽니다.");
		}else {
			System.out.println("두 수 가 같습니다.");
		}
		
	}
}
