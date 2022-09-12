import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr1[] = new int[4];
		// int 0,1,2,3
		
	
		for(int i=0;i<arr1.length;i++) {
			
			System.out.print((i+1)+"번째 값 :");
			arr1[i] = Integer.parseInt(sc.nextLine());
			
		}
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println((i+1)+"번째 값 :"+arr1[i]);
		}
		
		
	}
}
