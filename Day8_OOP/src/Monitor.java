
public class Monitor {
	private String brand ="LG"; // heap 에 만들어진 변수는 0 값을 가진다
	private int price = 1000; // default value : 클래스 설계자 만이 셋팅할수 있는 초기값
	private double weight = 27.5;
	// class 내부에 만들어진 변수는 멤버필드 (Member Field) 라 부른다.
	
	void powerOn() {}
	void powerOff() {}
	void volumeUp() {}
	void volumeDown() {}
	// > 멤버메서드 (Member Method) 
	
	// Constructor - 생성자 메서드
	// 규칙
	// 1. 생성자 메서드의 이름은 클래스의 이름과 동일해야 한다.
	// 2. return 값을 가지지 않는다.
	// 3. 생성자 메서드는 콜 시점은 개발자가 지정할 수 없다. (콜 되는 시점이 정해져 있다)
	// 4. 암묵적으로 존재, 묵시적 문법
	// Exam >> Monitor(){} 
	
	public Monitor() {}// 생성자 오버로딩
	public Monitor(String brand, int price, double weight) {
		System.out.println("모니터 생성자 실행됨");
		this.brand = brand;
		this.price = price;
		this.weight = weight;
		
	} 
	  // !! 명시적 생성자 메서드가 들어가면 기본 생성자 메서드가 사라짐
	  // new 인스턴스가 생성될 때 실행됨
	  // 초기값을 생성해줌
	
	
	
	
	// Nested Class - 중첩된 클래스 : 클래스 안에서 클래스를 만드는경우 
	
	// Class 내부에 주를 구성하는 네가지 요소 : Member Field/Member Method/Constructor/Nested Class
	// 주로 Member Field , Member Method, Constructor 가 쓰인다 99%
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

	
	
}
