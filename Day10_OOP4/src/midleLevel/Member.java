package midleLevel;

abstract public class Member {
	// 상속문법

	// 클래스 간의 관계
	// Has-A 포함관계 { A Has a B } 
	// IS-A 상속관계 { A Is a B }

	// Exam {
//		Tiger is a []
//		Bear is a []
//				
//		Gold is a []
//		Silver is a []
//				= Member
//				= Grade }
	
		private int id;
		private String name;
		private int point;
		
		public Member() {}
		public Member(int id, String name, int point) {
			this.id = id;
			this.name = name;
			this.point = point;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getPoint() {
			return point;
		}
		public void setPoint(int point) {
			this.point = point;
		}
		
		abstract public double getBonus(); 
		// 추상화 기법 : 내용이 없는 메서드
		// abstract 설계 목적으로 쓰기 위한 추상메서드
		// 추상 메서드를 가진 클래스는 추상 클래스가 되어야 한다.
		
}
