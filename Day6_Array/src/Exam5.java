
public class Exam5 {
	public static void main(String[] args) {
		
		
		
		// 1~5난수 3번 출력
//		for (int i = 0; i < 3; i++) {
//			
//			int rd = ((int)(Math.random()*5+1));
//			System.out.println((int)rd);
//			
//			
//			
//		}
		
		// 중첩되지 않게 난수를 생성하는 방법 
		
		int[] cards = new int[] {1,2,3,4,5};
		
		// 셔플 code
		
		for (int i = 0; i < cards.length*10; i++) {
			int x = (int)(Math.random()*5);
			int y = (int)(Math.random()*5);
			
			int tmp = cards[x]; // 빈 변수 tmp 에 x인덱스 배열값을 대입
			cards[x] = cards[y]; // 대입되고 비어버린 x인덱스 배열값에 y인덱스 배열값 대입
			cards[y] = tmp; // 대입되고 비어버린 y인덱스 배열값에 tmp 값을 대입
			
		}
		
		System.out.println(cards[0] + " : " + cards[1] + " : " + cards[2]);
		
		
	}
}
