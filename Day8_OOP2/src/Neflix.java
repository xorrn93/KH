import java.util.Iterator;
import java.util.Scanner;

public class Neflix {
	public static void main(String[] args) {
		// << Netflix 예제 >>
		// 1. 신규 영화 등록
		// 2. 영화 목록 출력
		// 3. 영화 검색
		// 4. 프로그램 종료
		// 선택 >>
		
		
		
		
		// 3번 선택시 
		// 검색할 영화를 입력받아, 검색된 대상의 제목 / 장르 / 평점만 출력
		// Option > 검색 대상이 없다면 "찾을 수 없습니다 " 출력
		
		Scanner sc = new Scanner(System.in);
		ListMvs[] mvs = new ListMvs[10];
		int count = 0; // 영화가 등록 될때마다 카운트
		
		while(true) {
			
			System.out.println("<< Netflix 예제 >>\r\n"
					+ "1. 신규 영화 등록\r\n"
					+ "2. 영화 목록 출력\r\n"
					+ "3. 영화 검색\r\n"
					+ "4. 프로그램 종료\r\n"
					+ "선택 >>");
			
			int menu = Integer.parseInt(sc.nextLine()); 
			
			switch (menu) {
			
			case 1:
				// 1번 선택시 
				// 영화의 제목, 장르, 평점을 입력받아 저장소에 저장 ( 클래스 이름이나 배열 이름등은 알아서..)
					
					System.out.println("=== 신규 영화 등록 ===");
					System.out.print("제목을 입력해주세요 :");
					String name = sc.nextLine(); 
					System.out.print("장르를 입력해주세요 :");
					String genre = sc.nextLine(); 
					System.out.print("평점을 입력해주세요 :");
					double gpa = Double.parseDouble(sc.nextLine()); 
					mvs[count] = new ListMvs( name,  genre,  gpa);
					count++;
				
				break;
			case 2:
				// 2번 선택시
				// 배열에 저장 되어있는 모든 영화 정보를 제목 / 장르 / 평점 순으로 출력
				
				System.out.println("제목"+"\t"+"장르"+"\t"+"평점");
				for (int i = 0; i < count; i++) {
					System.out.println(mvs[i].getName()+"\t"+mvs[i].getGenre()+"\t"+mvs[i].getGpa());
					
				}
				break;
			case 3:
				// 3번 선택시 
				// 검색할 영화를 입력받아, 검색된 대상의 제목 / 장르 / 평점만 출력
				// Option > 검색 대상이 없다면 "찾을 수 없습니다 " 출력
				System.out.println("=== 영화 검색 ===");
				
				
				if(count > 0) {
					System.out.println("이름 으로 검색 :");
					String find = sc.nextLine();
					for (int i = 0; i < count; i++) {
						if(mvs[i].getName().equals(find)==true) {
							System.out.println(mvs[i].getName()+"\t"+mvs[i].getGenre()+"\t"+mvs[i].getGpa());
							break;
						}else {
							continue;
						}
					}	
				} else {
					System.out.println("저장된 영화가 없습니다.");
				}
				
				break;
			case 4:
				System.exit(0);
				break;
				

			default:
			}
		}
		
		

		
	}
}
