
public class Exam1 {
	public static void main(String[] args) {
		
		byte a = 127; 
		// 정수형, 숫자만 저장가능 , 1byte = 256개의 숫자까지 저장가능
		short b = 32767; // 사용빈도 낮음
		char c = 'a'; // 1글자, 문자를 저장하기 위해 설계, 음수가 없다
		char z = 65535; //
		int d = 1000000000; // ~21억
		long e = 1000000000000L; 
		// 숫자값을 int까지만 인식하기 때문에 끝에 L을 붙혀줌
		float f = 3.14F; 
		// java 에서는 실수를 double 로 인식하기 때문 실수뒤에 F를 붙혀줌
		double g = 5.12;
		boolean h = true; // false
		//기본 8대 자료형 이라 부른다
		
		String i = "hello"; //참조형은 모두 4byte
		String j = "asdjqefowhifowhefowefhiweo"; 
		// i 와 j 는 같은 4byte 이다, 주소를 저장하는 값이 기 때문
		
		
	}
}
