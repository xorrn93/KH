package midleLevel;

import java.util.ArrayList;

public class Manager {
	// Model
//	private Silver[] silverMembers = new Silver[10];
//	private Gold[] goldMembers = new Gold[10];
//	private int silverIndex = 0;
//	private int goldIndex = 0;
	private ArrayList<Member> member = new ArrayList<>();
//	1.배열을 사용하면 사이즈를 명시할 수 없다.
	
	public void addMember(Member m) {
//		member[this.index++] = m;
		member.add(m);
	}
	
	// Model Part 에서는 print 를 담당하지 않는게 좋다
	public ArrayList getMembers() {
		return member;
//		return members;
	}
}
