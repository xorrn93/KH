package midleLevel;
import java.util.ArrayList;
import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
	
//	Object o = new Scanner(System.in);
//	o=10;
//	o=Math.random();
//	o=new Exam2();
	// 객체의 모든 클래스는 Object 를 상속 받는다.
	// 묵시적으로 항상 존재
		
	System.out.println("ArrayLIst 예제");	
	ArrayList<String> arr = new ArrayList<>();
	
	// == Vector arr = new Vector();
	// <> 제너릭을 사용해 ArrayList 의 자료형을 Object 배열을 원하는 자료형 배열로 변환
	// 인스턴스 에도 <> 를 붙혀줘야 함
	// 다형성 을 잃어버리고 편리성 = 다운캐스팅이 필요없음

	arr.add("Hello");
	arr.add("World");
	arr.add("제너릭");
	
//	arr.add(100);
//	arr.add(new Scanner(System.in));
//	arr.add(new Exam2());
	
//	arr.remove(0); // arr[0] delete
//	
//	System.out.println(arr.get(0));
//	System.out.println(arr.get(1));
//	
//	arr.add(1, "Hello");
//	
//	System.out.println(arr.get(0));
//	System.out.println(arr.get(1));
//	System.out.println(arr.get(2));
//	
//	System.out.println(arr.size());
	// ArrayList Size
	
	}
}
