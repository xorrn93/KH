import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		// 1~n 까지의 합
		int i=0;
		int sum=0;
		
		while (i<=n) {
			sum+=i;
			i++;
			
		}
		System.out.println(sum);
	}
}
