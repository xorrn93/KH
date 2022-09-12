package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void printStudent(ArrayList<Student> stds) {
		System.out.println("학번"+"/"+"이름"+"/"+"국어"+"/"+"영어"+"/"+"수학"+"/"+"합계"+"/"+"평균");
		for (Student std : stds) {
			System.out.println(std.getId()+"/"+
							   std.getName()+"/"+
							   std.getKor()+"/"+
							   std.getEng()+"/"+
							   std.getMath()+"/"+
							   std.getTotal()+"/"+
							   std.getAvg()
					);
		}
		
	}
	public static void main(String[] args) {
//		View + Control
		
		Scanner sc = new Scanner(System.in);
		Manager manager = new Manager();
		while (true) {
			
			System.out.println("<< 학생 관리 시스템>>\r\n"
					+ "1. 신규 정보 입력\r\n"
					+ "2. 학생 목록 출력\r\n"
					+ "3. 학생 정보 검색\r\n"
					+ "4. 학생 정보 삭제\r\n"
					+ "5. 학생 정보 수정");
			System.out.println(">> ");
			int input = Integer.parseInt(sc.nextLine());
			
			switch (input) {
			case 1:
				
				// case 1 : 신규 정보 입력
				System.out.println("<< 신규 정보 입력 >>");
				try {
					System.out.println("학번을 입력해주세요\r\n"
							+ ">>\r\n");
					int id = Integer.parseInt(sc.nextLine());
					System.out.println("이름을 입력해주세요\r\n"
							+ ">>\r\n");
					String name = sc.nextLine();
					System.out.println("국어 성적을 입력해주세요\r\n"
							+ ">>\r\n");
					int kor = Integer.parseInt(sc.nextLine());
					System.out.println("수학 성적을 입력해주세요\r\n"
							+ ">>\r\n");
					int math = Integer.parseInt(sc.nextLine());
					System.out.println("영어 성적을 입력해주세요\r\n"
							+ ">>\r\n");
					int eng = Integer.parseInt(sc.nextLine());
					
					System.out.println("입력이 완료 되었습니다");
					
					manager.add(new Student(id,name,kor,math,eng));
				} catch (Exception e) {
					System.out.println("올바른 값을 입력해주세요");
				}
				// 입력 부분
				
				break;
			case 2:
				// case 2 : 학생 목록 출력
				
				ArrayList<Student> stds = manager.getStds();
				
				if (stds.size() != 0) {
					printStudent(stds);
				}
				else {
					System.out.println("입력값이 존재하지 않습니다.");
				}
				
				break;
			case 3:
				// case 3 : 학생 정보 검색
				
				System.out.println("검색할 학생의 이름을 입력해주세요\r\n"
									+ ">>\r\n");
				String	name = sc.nextLine();
				ArrayList<Student> result = manager.searchByName(name);
				
				if(result.size() == 0) {
					System.out.println(name +"학생이 존재하지 않습니다");
				}
				else {
					printStudent(result);
					}
				break;
			case 4:
				// case 4 : 학생 정보 삭제
				System.out.println("삭제할 학생의 학번을 입력해주세요\r\n"
						+ ">>\r\n");
				int inputId = Integer.parseInt(sc.nextLine());
				
				manager.deleteById(inputId);
				break;
			case 5:
				// case 5 :학생 정보 수정
				System.out.println("수정할 학생의 학번을 입력해주세요\r\n"
						+ ">>\r\n");
				int id = Integer.parseInt(sc.nextLine());
				
				System.out.println("국 어 :");
				int kor = Integer.parseInt(sc.nextLine());
				
				System.out.println("영 어 :");
				int eng = Integer.parseInt(sc.nextLine());

				System.out.println("국 어 :");
				int math = Integer.parseInt(sc.nextLine());

				Student std = new Student(id,null,kor,eng,math);
				manager.updateById(std);
				
				break;

			default:
				// 올바른 메뉴 값을 입력해주세요
				System.out.println("올바른 메뉴값을 입력해 주세요");
				continue;
			}
		}
	}
}
