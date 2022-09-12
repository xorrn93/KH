import java.util.Scanner;

public class TomJerry {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("톰과제리의 나오는 쥐의 이름은?");
		System.out.println(">> ");
		
		String quest = sc.nextLine();
		
		String answer1 = "jerry"; 
		String answer2 = "tom"; 
		
		if(quest==answer1){
			
			System.out.println("정답!");
			
		}else if(quest==answer2){
			
			System.out.println("톰은 고양이 입니다 ㅠ ㅠ");
			
		}else {
			
			System.out.println("틀렸습니다..");
		};
		
		
	}};
