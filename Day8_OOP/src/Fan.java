
public class Fan {
	
	private int power;
	private int rotation; // 클래스 안에 만들어진 멤버변수 > heap 메모리에 저장됨  
	
	public int getPower() {
		return power;
	}
	
	public void setPower(int power) {
		// power = power; 오류 : 메개 변수와 지역변수 의 이름이 같을때 구분이 어렴다
		this.power = power; 
		// this : 객체 자신의 대한 참조값을 가진다.
		// method 내에서만 사용 
	}// method 안에 만들어진 변수는 지역변수 > stack 메모리
	 // 똑같은 이름의 변수를 사용해도 오류가 나지 않는다. 저장된 메모리 공간이 다르기 때문!! 
	public int getRotaion() {
		
		return rotation;
	}
	
	public void setRotation(int rotation) {
		this.rotation = rotation;
		if(this.rotation == 1) {
			System.out.println("회전 시작");
		}else if(this.rotation == 0) {
			System.out.println("회전 종료");
		}
	}
	
}
