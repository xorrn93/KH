import java.util.Iterator;

public class Exam1 {
	public static void main(String[] args) {
		
		// 배열은 참조자료형에 해당한다
		//DataType[] 배열이름;

		int[] arr = new int[] {1,10,100,1000}; // Heap memory 를 쓰기 위한 문법
		// 배열의 주소를 담기위해서는 배열에 담아야한다
		
		//arr[0] = 1; // Heap memory
		//arr[1] = 10;
		//arr[2] = 100;
		//arr[3] = 1000;
		// arr[4] = 10000; !error
		
		//arr[0];
		//arr[1-1];
		//arr[(int)(Math.random()*3)];
		// 대괄호안에 숫자만 오면 된다
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
