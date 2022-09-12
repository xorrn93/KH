
public class Exam3 {
	
//	public static void func(int num) {
//		num =20; 
//		// 매개 변수의 성질은 지역변수의 성질과 같다.
//		// 중괄호를 벗어나면 데이터가 사라진다
//		
//		System.out.println(num);
//		
//	}
	
	
//	public static void main(String[] args) {
//		
//		int num =10;
//		func(num);
//		System.out.println(num);
//	}
	
	public static void func(int[] arr) {
		arr[0] = 100;
		arr[1] = 200;
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {10,20}; 
		
		func(arr); // arr = 배열의주소
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		
		
		
		
		
		
		
		
	}
}
