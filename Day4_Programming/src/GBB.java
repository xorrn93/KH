import java.util.Scanner;

public class GBB {
	
	
	public static int myRand(int min, int max) {
		
		int result = (int)(Math.random()*max-min+1)+max;
		
		return result;
		
	}
	
	public static void func() {
		System.out.println("Hello");
	}
	
	
	public static void main(String[] args) {
		
		// 가위바위보 게임
		// 가위 바위 보 중 하나를 선택 승패를 결정하는 게임
		// 승패를 결정하는 if문은 중첩if문 금지(|| && 활용)
		
		System.out.println("가위바위보 게임");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 선택하세요(1.가위/2.바위/3.보) :");
		int input = Integer.parseInt(sc.nextLine());

		
//		int computer = (int)(Math.random()*3)+1;
		int computer = myRand(1,3);

		System.out.println("결과");
		// 이겼을때, 졌을때, 비겼을떄
		switch (input) {
		case 1:
			
			System.out.println("당신은 가위를 냈습니다");
			if(input == computer) {
				System.out.println("컴퓨터는 가위를 냈습니다");
				System.out.println("draw!");
			}else if(computer == 2) {
				System.out.println("컴퓨터는 바위를 냈습니다");
				System.out.println("you lose!");
			}else {
				System.out.println("컴퓨터는 보를 냈습니다");
				System.out.println("you win!");
			}
			break;
		case 2:
			System.out.println("당신은 바위를 냈습니다");

			if(input == computer) {
				System.out.println("컴퓨터는 바위를 냈습니다");
				System.out.println("draw!");
			}else if(computer == 3) {
				System.out.println("컴퓨터는 보를 냈습니다");
				System.out.println("you lose!");
			}else {
				System.out.println("컴퓨터는 가위를 냈습니다");
				System.out.println("you win!");
			}
			break;
		case 3:
			System.out.println("당신은 보를 냈습니다");
			
			if(input == computer) {
				System.out.println("컴퓨터는 보를 냈습니다");
				System.out.println("draw!");
			}else if(computer == 1) {
				System.out.println("컴퓨터는 가위를 냈습니다");
				System.out.println("you lose!");
			}else {
				System.out.println("컴퓨터는 바위를 냈습니다");
				System.out.println("you win!");
			}
			break;

		default:
			
			System.out.println("올바른 숫자를 선택해주세요");
			break;
		}
		
		
	}
}
