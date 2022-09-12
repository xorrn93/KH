
public class Exam2 {
	public static void main(String[] args) {
		
//		short a = 0;
//		byte b = 10;
//		a = b;
//		
//		System.out.print(a);
		
		System.out.println(10/3f); 
		// 정수끼리 연산했을때 실수가 나올수 없다
		
		int sum = 98;

		System.out.println( "당신의 총점은" + sum + '점');
		// Data promotion
		System.out.println( '점'+ sum + "당신의 총점은" );
		// 문자열 끼리 더하면 연산이 아닌 연결이 된다.
		
		byte b = 0;
		short s = 100;
		
		b = (byte)s;
		System.out.println(b);
		// Data casting
		

	}
}
