package midleLevel;

public class Silver extends Member{
	
	public Silver(int id,String name,int point){
//		this.setId(id);
//		this.setName(name);
//		this.setPoint(point);
		super(id,name,point); // 자신의 부모클래스의 생성자를 불러주세요
		
	}
//	overrides (무효화 시키다) 부모클래스로 부터 상속받은 기능을 자식클래스 에서 재정의해 사용
//	public double getBonus() {
//		return this.getPoint()*0.02;
//	}

	@Override
	public double getBonus() {
		return this.getPoint()*0.02;
	}
}
