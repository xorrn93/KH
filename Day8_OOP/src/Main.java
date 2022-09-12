import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Tv tv = new Tv();
		
//		tv.volume = 20; // public 어디서나 사용 가능 
//		tv.channel = 10; // private 클래스 내부에서만 사용
		
//		tv.chnnelDown(); 
		
		tv.setVolume(20);
		
		Monitor m = new Monitor("Samsung",10000,30.5);
		
//		m.setBrand("Samsung");
//		m.setPrice(20000);
//		m.setWeight(30.2);//class 사용자가 default 값을 변경
		
		
		
		System.out.println(m.getBrand()); //0 =null
		System.out.println(m.getPrice()+" won"); //0
		System.out.println(m.getWeight()+" kg"); //0
		
		
	}
}

