import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		
		// 입력단계 준비
		Scanner sc=new Scanner(System.in);

		System.out.println("====나와 가장 닮은 개발 언어 찾기 TEST!====");
		System.out.println("언어들도 각자 성격이 다르고, 장단점이 명확합니다. \r\n"
				+ "테스트 결과 하단에 언어별 설명도 간단하게 적어두었으니\r\n"
				+ "나와 얼마나 비슷한지 살펴보세요! ");

		System.out.println("\r\n"
				+ "<1~4번 중 언어를 고르세요!>");
		System.out.println("1. C ");
		System.out.println("2. python ");
		System.out.println("3. java ");
		System.out.println("4. Swift ");
		// 입력된 값
		System.out.println("\r\n"
				+ "당신의 선택은? :  ");
		int choice = Integer.parseInt(sc.nextLine());
		
		
		// 출력
		if (choice==1) {
			System.out.println("벽 그 자체 프로일잘러 인간 C");
			System.out.println("=======================");
			System.out.println("무려 70년대에 만들어졌음에도 늘 인기 순위 탑인 C언어!\r\n"
					+ "기본에 충실하고, 컴퓨터와 친한 C는 엄격한 문법을 가지고 있어 \r\n"
					+ "코드 간의 구동 원리를 깨우치는 데 좋습니다. \r\n"
					+ "윈도우, 포토샵, 엑셀, 한글 등 성능이 중요한 애플리케이션에서 \r\n"
					+ "사용되는 언어라 프로일잘러로 등극했습니다.  ");
		}else if (choice==2) {
			System.out.println("단순명쾌 빠워긍정 인간 Python");
			System.out.println("=======================");
			System.out.println("‘단순명쾌’까지만 봐도 파이썬을 예측하신 분들이 계실 것 같아요. \r\n"
					+ "초보 개발자분들에게 가장 많이 사랑받는 언어죠. \r\n"
					+ "빠른 속도로 개발할 수 있고, 단순하고 명료한 코드 작성을 지향하는 언어라 \r\n"
					+ "단순명쾌 빠워긍정이신 분들에게 딱이에요");
		}else if (choice==3) {
			System.out.println("무심한 듯 다정한 츤데레 인간 Java");
			System.out.println("=======================");
			System.out.println("요새 개발자라면 자바 안 배우는 분들 없죠. \r\n"
					+ "쉬운 편은 아니지만 늘 인기가 많은 언어입니다. \r\n"
					+ "자바가 츤데레인 이유! 눈앞에 보이는 화면 말고, \r\n"
					+ "무심한 듯 시크하게 뒤에서 지원해주는 프로그램을\r\n"
					+ "만드는 데 유용하기 때문이에요. ");
		}else if (choice==4) {
			System.out.println("마이웨이 힙스터 인간 Swift");
			System.out.println("=======================");
			System.out.println("애플이 2014년에 공개한 언어죠. iOS, macOS, watchOS 등 \r\n"
					+ "애플 플랫폼에 최적화되어 있습니다. \r\n"
					+ "속도가 무척 빠르고 읽고 쓰기 쉬운 문법으로 구성되어 있어요. \r\n"
					+ "개발자들이 원하던 현대적이고 HIP한 문법이랄까요? \r\n"
					+ "트렌드 세터와 잘 어울리는 언어입니다. ");
		}else {
			System.out.println("1~4번 중 선택해주세요. ㅜㅜ");
		}
	}
}
