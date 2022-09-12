
public class Exam2 {
	public static void main(String[] args) {
		
		// char 형 배열 3칸 A F Z
		char arr[] = new char [] {'A','F','Z'};
		// String 형 배열 2칸 짜리 Hello , Array
		String arr1[] = new String [] {"Hello","Array"};
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		// int 형 배열 arr3을 100칸 짜리로 만들고 
		// 100~1 역순으로 담아보세요
		
		int arr3[] = new int[100];
		for (int j = 0; j < arr3.length; j++) {
			arr3[j] = 100 -j;
		}
		System.out.println(arr3[99]);
		System.out.println(arr3[0]);
		
		// char 형 배열 arr4를 26칸 짜리로 만들고
		// A_Z 또는 Z_A 까지 담아보세요
		
		char arr4[] = new char[26];
		for (int i = 0; i < arr4.length; i++) {
			arr4[i] = (char)('A'+i);
		}
		System.out.println(arr4[25]);
		System.out.println(arr4[0]);
	}
}
