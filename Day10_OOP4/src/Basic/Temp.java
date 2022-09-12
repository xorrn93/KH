package Basic;

public class Temp {
	// Member Field
	
	public int a; 
	// Instance Member Field
	// 어디서나 접근 가능한 변수 (인스턴스를 생성 할 시)
	public static int b; 
	// Class Member Filed 
	// 언제 어디서나 접근 가능한 변수 , 전역 변수
	
	public void funcA() {
		a =10;
		b =20;
		
	}
	public static void funcB() {
//		a =10; Instance 가 아직 생성 전에 호출 할 수 없다
		b =20;
		
	}
	
	
	
}
