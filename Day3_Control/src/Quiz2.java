import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("1~100 정수 입력 :");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println(num1);
		
		if(1<=num1 && num1<=100) {
			
			if(num1%2==0) {
				System.out.println("== 결과 == ");
				System.out.println("입력한 수는 짝수 입니다");
			}else {
				System.out.println("== 결과 == ");
				System.out.println("입력한 수는 홀수 입니다");
			}
			
		} else {
			
			System.out.println("1~100 사이 정수를 입력하세요");
		}
		
	}
}
