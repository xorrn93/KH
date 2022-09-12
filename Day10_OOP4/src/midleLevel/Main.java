package midleLevel;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
//	View, Control
	public static void main(String[] args) {
//		 Design pattern MVC1
//		 Model , View + Control(With)
		
//		 Model - Array
//		 View - Main
//		 Control - IF,FOR 
		Scanner sc  = new Scanner(System.in);
		Manager manager = new Manager();
		
//		회원관리 시스템의 치명적 이슈
		
//		1. 코드의 중복도가 높다 (유지보수의 난이도가 극악수준으로 올라간다, 인수인계가 어려워진다)
//		>> 상속 문법으로 해결 한다.
//		2. 코드의 응집도가 높다
//		>> **다형성**의 문법으로 해결 한다
//		3. 데이터 저장소 문제 (배열의 길이의 가변성)
//		>> **Collection** 으로 해결 한다
		
		while(true) {
			System.out.println("<< 회원 관리 시스템 >>\r\n"
					+ "1. 신규 회원 등록\r\n"
					+ "2. 회원 정보 등록\r\n"
					+ ">>");
			
			int menu = Integer.parseInt(sc.nextLine());
			
			if (menu == 1) {
				
				manager.addMember(new Silver(1001,"Alice",1000));
				manager.addMember(new Silver(1002,"Tom",2000));
				manager.addMember(new Silver(1003,"Jason",3000));
				manager.addMember(new Gold(1004,"Mike",4000));
				manager.addMember(new Ruby(1005,"Elsa",5000));
				
			}else if(menu == 2) {
				
				ArrayList members = manager.getMembers();	
				System.out.println("아이디/이름/포인트/보너스");
				
				for (Member m : members) {
					System.out.println(w
							members.get(m).getId()+"\t"+members.get(m).getName+"\t"+
									members.get(m)).getPoint()+"\t"+
									members.get(m)).getBonus()
							);
//					if(members[i] instanceof Silver) {
//						System.out.println(((Silver)members[i]).getBonus());
//					}else if (members[i] instanceof Silver) {
//						System.out.println(((Gold)members[i]).getBonus());
//					}
				}
			}
		}
	}
}
