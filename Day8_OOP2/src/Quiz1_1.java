import java.util.Scanner;

public class Quiz1_1 {
	public static void main(String[] args) {
		
		  //<<학생 관리 프로그램>>
	      //1. 신규 정보 입력
	      //2. 학생목록 출력
	      //3. 프로그램 종료

	      //1번 선택시
	      //학생의 이름, 국어, 영어 점수를 입력 받아 Student 인스턴스로 생성 후
	      //Student형 배열에 저장
	      //2. 배열에 저장되어 있는 모든 학생 정보를 이름/국어/영어/합계/평균 순으로 모두 출력
	      //배열에 한명의 정보도 저장 되어 있지 않을시 "출력할 내용이 없습니다"라고안내.

		Scanner sc = new Scanner(System.in);
		Student[] stds = new Student[10];
		

		main: while(true) {
			System.out.println(" <<학생 관리 프로그램>>\r\n"
					+ "1. 신규 정보 입력\r\n"
					+ "2. 학생목록 출력\r\n"
					+ "3. 프로그램 종료\r\n"
					+ "");
			
			int num = Integer.parseInt(sc.nextLine());
			
			if(num == 1) {
				
				for (int i = 0; i < stds.length; i++) {
					
					System.out.println("** name 의 Exit 를 입력시 종료합니다.");
					System.out.print("학생의 이름을 입력하세요 >");
					String name = sc.nextLine();
					if(name.equals("Exit")) {
						continue main;
					}
					System.out.print(name+"학생의 국어점수를 입력하세요 >");
					int kor = Integer.parseInt(sc.nextLine());
					System.out.print(name+"학생의 영어점수를 입력하세요 >");
					int eng = Integer.parseInt(sc.nextLine());
					stds[i] = new Student(name,kor,eng);
					
					
				}
				
			}else if(num == 2) {
				
				try {
					System.out.println("이름"+"\t"+"국어"+"\t"+"영어"+"\t"+"합계"+"\t"+"평균");
					for (int i = 0; i < stds.length; i++) {
						
						System.out.println(stds[i].getName()+
										"\t"+stds[i].getKor()+
										"\t"+stds[i].getEng()+
										"\t"+stds[i].getTotal()+
										"\t"+stds[i].getAvg());
						
					}
				} catch (NullPointerException e) {
					System.out.println("출력할 내용이 없습니다.");
				}
			
			}else if(num == 3) {
				System.out.println("시스템을 종료합니다");
				System.exit(0);
			}else {
				System.out.println("올바른 메뉴 숫자를 입력해주세요");
				continue main;
			}
		}
	}
}
