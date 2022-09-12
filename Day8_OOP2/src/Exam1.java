
public class Exam1 {
	public static void main(String[] args) {
		
		// 변수 > 배열 > 구조체 > 클래스
		
		Student std1 = new Student("Tom",50,80);
//		Student std1 = new Student(); 매개변수가 없는 생성자를 찾을 수 없다.
		
//		std.setName("Tom");
//		std.setKor(50);
//		std.setEng(80);
		Student std2 = new Student("Sunny",60,90);
		Student std3 = new Student("Alex",90,40);
		
		System.out.println(std1);
		System.out.println(std2);
	}
}
