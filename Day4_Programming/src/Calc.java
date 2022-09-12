import java.util.Scanner;

public class Calc {

	public static int validNum() {
		while(true) {
			try {
				Scanner sc = new Scanner(System.in);
				int num = Integer.parseInt(sc.nextLine());
				return num;
			} catch (Exception e) {
				
				System.out.println("숫자를 입력해주세요");
			}
		}
	}
	
	
	
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
//      int num1 = 0;
//      int num2 = 0;
      
      while(true) {
         System.out.println("=== 계산기 프로그램 ===");

         System.out.print("연산자 입력 (+,-,*,/,q[종료]) : ");
         String oper = sc.nextLine();

         if(oper.equals("q")) { // q를 눌렀을 경우
            System.out.println("계산기를 종료합니다.");
            System.exit(0);
         }else if(oper.equals("+") || oper.equals("-") || 
               oper.equals("*") || oper.equals("/")) {
            
        	 System.out.println("첫번째 수 :");
        	 int num1 = validNum();
        	 
        	 System.out.println("두번째 수 :");
        	 int num2 = validNum();
        	 
        	 System.out.println("=== 결 과 ===");

                if(oper.equals("+")) {
                   System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
                }else if(oper.equals("-")) {
                   System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
                }else if(oper.equals("*")) {
                   System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
                }else if(oper.equals("/")) {
                   System.out.println(num1 + " / " + num2 + " = " + ((double)num1/num2));
                }
             }
         else {
                System.out.println("연산자를 다시 확인해주세요.");
             }

        	 
            
            }



        


         //         else if(!oper.equals("+") && !oper.equals("-") &&
         //                !oper.equals("*") && !oper.equals("/")) { // 연산자가 아닌 다른 무언가를 입력했을 경우
         //            System.out.println("연산자를 다시 확인해주세요.");
         //            continue;
         //         }


      }
   }
