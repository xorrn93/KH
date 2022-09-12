
public class Quiz1 {
	public static void main(String[] args) {
		
		String str = "WOUSJSKSOSUSOLOPOJIIPJSSS";
		System.out.println("대문자의 S 의개수 : " + countS(str,'S'));
	}
	
	public static int countS(String input,char ch) {
			int count = 0;
		// String 값을 받아서 대문자 S 의 개수를 반환
		// 1. String 값을 받아서 S 를 포함하지는 검사한다
		// 2. S 의 개수를 카운트 해서 반환 int 값으로 반환한다.
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i)==ch) {
				count++;
			}
			
		}
		
		return count;
		
			
	}
}
