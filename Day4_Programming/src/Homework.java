import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		//menu
		int money = 3000;
		int coke = 1000;
		int sprite = 800;
		int mesil = 1500;
		
		//item
		int coke_sum =0;
		int sprite_sum =0;
		int mesil_sum =0;
		int item_sum =0;
		//simulator 
		while (true) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("=== 자판기 시뮬레이터 ===");
			System.out.println("음료수를 선택하세요");
			System.out.println("1. 콜라 (1000) 2. 사이다(800) 3.메실차(1500) [0. 소지품확인]");
			System.out.println("선택 >> ");
			int number = Integer.parseInt(sc.nextLine());
			
			switch (number) {
			case 1:
				if(money>=coke){
					
					money-=coke;
					coke_sum+=1;
					item_sum = coke_sum+sprite_sum+mesil_sum;
					
					System.out.println("======소지품 목록=======");
					System.out.println("소지금 :"+money);
					System.out.println("콜라 :"+coke_sum);
					System.out.println("사이다 :"+sprite_sum);
					System.out.println("매실차 :"+mesil_sum);
					System.out.println("총 갯수:"+item_sum);
					System.out.println("=====================");
					
				}else {
					System.out.println("*** 잔액부족 ***");
				}
				
				break;
			case 2:
				
				if(money>=sprite){
					
					money-=sprite;
					sprite_sum+=1;
					item_sum = coke_sum+sprite_sum+mesil_sum;
					
					System.out.println("======소지품 목록=======");
					System.out.println("소지금 :"+money);
					System.out.println("콜라 :"+coke_sum);
					System.out.println("사이다 :"+sprite_sum);
					System.out.println("매실차 :"+mesil_sum);
					System.out.println("총 갯수:"+item_sum);
					System.out.println("=====================");
					
				}else {
					System.out.println("*** 잔액부족 ***");
				}
				
				break;
			case 3:
				
				if(money>=mesil){
					
					money-=mesil;
					mesil_sum+=1;
					item_sum = coke_sum+sprite_sum+mesil_sum;
					
					System.out.println("======소지품 목록=======");
					System.out.println("소지금 :"+money);
					System.out.println("콜라 :"+coke_sum);
					System.out.println("사이다 :"+sprite_sum);
					System.out.println("매실차 :"+mesil_sum);
					System.out.println("총 갯수:"+item_sum);
					System.out.println("=====================");
					
				}else {
					System.out.println("*** 잔액부족 ***");
				}
				
				break;
			case 0:
				System.out.println("======소지품 목록=======");
				System.out.println("소지금 :"+money);
				System.out.println("콜라 :"+coke_sum);
				System.out.println("사이다 :"+sprite_sum);
				System.out.println("매실차 :"+mesil_sum);
				System.out.println("총 갯수:"+item_sum);
				System.out.println("=====================");
				break;
				
			default :
				System.out.println("잘못된 입력값입니다");
				break;
			}
			
		}
		
		
	}
}
