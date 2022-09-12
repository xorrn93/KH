
public class Exam4 {
	public static void main(String[] args) {
		
		int[] arr = new int[] {10,20};
		// arr[0] = arr[1]; : ?
		// 인덱스값을 교환 하고 싶은 경우
		
		System.out.println(arr[0]+":"+arr[1]);
		
		// 스왑 기법
		int[] tmp = new int[2];
		tmp[0] = arr[1];
		tmp[1] = arr[0];
		
		//int[] tmp = arr[0];
		//arr[0] = arr[1];
		
		System.out.println(tmp[0]+":"+tmp[1]);
	}
}
