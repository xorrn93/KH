package midleLevel;

public class ExmapleFor {
	public static void main(String[] args) {
		
		int[] arr = new int[] {5,4,1,3,2};
		String[] arr2 = new String[] {
			"hello","world","java"
		};
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//			
//		}
//		
		for (int a : arr) {
			// foreach 문법
			// 1. : 오른쪽 Collection 삽입 
			// Collection > 하나 이상의 변수를 묶어서 사용하는 자료형태
			// 3. : 왼쪽 자료형 변수
			// 자동으로 요소의 개수 만큼 반복
			System.out.println(a);
			
			// 장점 : 코드의 편리성
			// 단점 :
			// 1. Collection 의 대상으로만 사용 가능
			// 2. i 값의 조절이 불가함, 출력의 횟수를 조정 불가
		}
			
		for(String s : arr2 ) {
			System.out.println(s);
		}
		}
	
}
