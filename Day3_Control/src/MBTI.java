import java.util.Scanner;

public class MBTI {
	public static void main(String[] args) {
		System.out.println("간당명료 mbti 검사");
		System.out.println("============================");
		Scanner sc= new Scanner(System.in);
		
		System.out.println("1. 고등학교에서 유명 했나요? : ");
		System.out.println("(yse는 1, no는 0)");
		
		int Quiz1 = Integer.parseInt(sc.nextLine());
		
		String answer1 = null;
		if(0 <= Quiz1 && Quiz1 <=1) {
			if(Quiz1 ==1) {
				answer1 ="E";
			}else{
				answer1 ="I";
			}
		}else {
			System.out.println(" 경고: 1과0 중에 입력해주세요! ");
			System.out.println(" 경고: 1과0 중에 입력해주세요! ");
			System.out.println(" 경고: 1과0 중에 입력해주세요! ");
			System.out.println(" 경고: 1과0 중에 입력해주세요! ");
			System.out.println(" 경고: 1과0 중에 입력해주세요! ");
		}
		
		System.out.println("2. 스포츠(운동)을 하시나요? : ");
		System.out.println("(yse는 1, no는 0)");
		
		int Quiz2 = Integer.parseInt(sc.nextLine());
		
		String answer2 = null;
		if(0 <= Quiz2 && Quiz2 <=1) {
			if(Quiz2 ==1) {
				answer2 ="S";
			}else{
				answer2 ="N";
			}
		}else {
			System.out.println(" 경고: 1과0 중에 입력해주세요! ");
			System.out.println(" 경고: 1과0 중에 입력해주세요! ");
			System.out.println(" 경고: 1과0 중에 입력해주세요! ");
			System.out.println(" 경고: 1과0 중에 입력해주세요! ");
			System.out.println(" 경고: 1과0 중에 입력해주세요! ");
		}
		
		System.out.println("3. 수학을 잘하나요? : ");
		System.out.println("(yse는 1, no는 0)");
		
		int Quiz3 = Integer.parseInt(sc.nextLine());
		
		String answer3 = null;
		if(0 <= Quiz3 && Quiz3 <=1) {
			if(Quiz1 ==1) {
				answer3 ="T";
			}else{
				answer3 ="F";
			}
		}else {
			System.out.println(" 경고: 1과0 중에 입력해주세요! ");
			System.out.println(" 경고: 1과0 중에 입력해주세요! ");
			System.out.println(" 경고: 1과0 중에 입력해주세요! ");
			System.out.println(" 경고: 1과0 중에 입력해주세요! ");
			System.out.println(" 경고: 1과0 중에 입력해주세요! ");
		}
		
		System.out.println("4. 지금 방이 깨끗한가요? : ");
		System.out.println("(yse는 1, no는 0)");
		
		int Quiz4 = Integer.parseInt(sc.nextLine());
		
		String answer4 = null;
		if(0 <= Quiz4 && Quiz4 <=1) {
			if(Quiz4 ==1) {
				answer4 ="J";
			}else{
				answer4 ="P";
			}
		}else {
			System.out.println(" 경고: 1과0 중에 입력해주세요! ");
			System.out.println(" 경고: 1과0 중에 입력해주세요! ");
			System.out.println(" 경고: 1과0 중에 입력해주세요! ");
			System.out.println(" 경고: 1과0 중에 입력해주세요! ");
			System.out.println(" 경고: 1과0 중에 입력해주세요! ");
		}
			
		System.out.println("============================");
		String result = answer1+answer2+answer3+answer4;
		System.out.println("당신의 mbti는 "+"'"+result+"'"+" 입니다");
		
		
	}
}
