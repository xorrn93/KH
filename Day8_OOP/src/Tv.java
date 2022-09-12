
public class Tv {
	
	//public int volume;
	//private int channel;
	
//	public void channelUp() {
//		channel = 20;
//	}
//	
	// 정보은닉 
	// public / protected / package / private - (접근제한자)
	// public 어디서나 사용 가능 
	// private 클래스 내부에서만 사용
	
//	public void chnnelDown() {
//		if (channel > 0) {
//		channel--;
//		}
//	}
	
	private int volume; // 클래스 안에 만들어진 멤버변수 > heap 메모리에 저장됨  
	private int channel;
//	private final Tv this; 암묵적으로 존재함 
//  개발 안정성 getter setter 를 이용해 호출
	
	public getThis(){
		return this; // this setter 가 불가능 
	} // this. 멤버필드를 호출
	
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		// Global Convention
		// Semantic Write
		
		// volume = vol;
		// volume = volume; 오류 : 메개 변수와 지역변수 의 이름이 같을때 구분이 어렴다
		this.volume = volume;
		// this : 객체 자신의 대한 참조값을 가진다. [Self Reference Field]
		// 값이 자동으로 생기고 , 값은 고정 값 final 상수 이기 때문
		// method 내에서만 사용
		// 암묵적 문법 = import java.lang.* 등
	}
	
	// method 안에 만들어진 변수는 지역변수 > stack 메모리
	// 똑같은 이름의 변수를 사용해도 오류가 나지 않는다. 저장된 메모리 공간이 다르기 때문!!
	
	public int getChannel() {
		
		return channel;
	}
	
	public void setChannel (int channel) {
		this.channel = channel;
		
	}
	
	// getter / setter 자동생성 단축키
	// alt + shift + s > r > alt + a > alt + r
	
	
	
}
