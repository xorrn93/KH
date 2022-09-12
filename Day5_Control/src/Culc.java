import java.util.Scanner;

public class Culc {
	public static void main(String[] args) {
		///////////////////// 계산기 프로그램 짜기//////////////////////
		Scanner sc = new Scanner(System.in);
		
		// 계산 결과
		double sum = 0;

		
		while (true) {
		System.out.println("===계산기 프로그램===");
		
		// 연산자 입력 (+,-,*,/)
		System.out.println("연산자 입력(+,-,*,/) [Q 종료] : ");
		String Operator = sc.nextLine();
		// system exit
		if(Operator.equals("Q")) {
			System.out.println("종료합니다");
			System.exit(0);}
		// 잘못된 입력 시
		else if(!Operator.equals("+") || !Operator.equals("-") || 
				!Operator.equals("*") || !Operator.equals("/")) {
			
			System.out.println("올바른 사칙연산을 입력해주세요");
			continue;
			
		}
		
//		else if(!Operator.equals("+") && !Operator.equals("-") && 
//				!Operator.equals("*") && !Operator.equals("/")) {
//			
//			System.out.println("올바른 사칙연산을 입력해주세요");
//			continue; // 반복문 에 닫히는 괄호 바로 앞에 떨어짐
//			
//		}
		
		// 첫번째 숫자 입력
		System.out.println("첫번째 숫자 입력 :");
		double num1 = Double.parseDouble(sc.nextLine());
		// 두번째 숫자 입력
		System.out.println("두번째 숫자 입력 :");
		double num2 = Double.parseDouble(sc.nextLine());
		
		if(Operator.equals ("+")) {
			
			sum = num1+num2;
			System.out.println("=====결과=====");
			System.out.println(num1+"+"+num2+"="+sum);
			
		}else if(Operator.equals ("-")) {
			
			sum = num1-num2;
			System.out.println("=====결과=====");
			System.out.println(num1+"-"+num2+"="+sum);
			
		}else if(Operator.equals ("*")) {
			
			sum = num1*num2;
			System.out.println("=====결과=====");
			System.out.println(num1+"*"+num2+"="+sum);
			
		}else if(Operator.equals ("/")) {
			
			sum = num1/num2;
			System.out.println("=====결과=====");
			System.out.println(num1+"/"+num2+"="+sum);
			
		}}
		
		
	}
}
