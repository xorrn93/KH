package midleLevel;

class A {
	public void funcA() {
		System.out.println("func A 입니다");
	}}
	
class B extends A{
	public void funcA() {
		System.out.println("func B 입니다");
	}

}

public class Example {
	public void main(String[] args) {
		
//		다형성 - 많은 형태를 가지는 성질
//		상속관계에 놓여있는 두 클래스 사이에서
//		상위클래스(부모) 참조 변수는 자신을 상속받는 하위클래스 인스턴스의
//		주소를 저장할 수 있다.
//		참조변수의 자료형 만큼만 사용할 수 있다
		
		A a = new B(); // Up Casting
		a.funcA();// 기본적으로 상위클래스의 기능만 사용가능
		
//		다운 캐스팅을 이용해 하위클래스 및 상위클래스의 모든기능을 다 쓸 수 있다
//		((B)a).funcB(); // Down Casting
		((B)a).funcA(); // Down Casting
		

		
	}}

