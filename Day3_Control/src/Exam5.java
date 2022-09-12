
public class Exam5 {
	public static void main(String[] args) {
		
		int j =0;
	//label break	
	abc: while(j < 5) {
			for(int i =1; i <= 10; i++) {
				if(i == 5) {
					break abc; 
					// 탈출 용도
					// label 이 붙어있는 반복문 까지 벗어남
					// 중복된 반복문을 벗어날 수 있음
				}
				System.out.println(i);
			}
			j++;
	}
}}
