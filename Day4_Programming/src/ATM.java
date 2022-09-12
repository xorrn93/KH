import java.util.Iterator;
import java.util.Scanner;

public class ATM {
   public static void main(String[] args) {
      
      int sum = 0;
      
      esc: while(true) {
      System.out.println("===ATM 시뮬레이터===\r\n"
            + "1. 잔액조회\r\n"
            + "2. 입금하기\r\n"
            + "3. 출금하기\r\n"
            + "4. 종료하기\r\n"
            + ">> "); 
      
      Scanner sc = new Scanner(System.in);
      int num = Integer.parseInt(sc.nextLine());
      
      switch (num) {
      case 1:
         
         System.out.println("현재 보유 잔액은"+sum+"원 입니다");
         
         break;
      case 2:
         System.out.println("얼마를 입금하시겠습니까?");
         int n = Integer.parseInt(sc.nextLine());
         
         if(n>0) {
         sum+=n;
         System.out.println(n+"원이 입금되었습니다");
         System.out.println("현재 보유 잔액은"+sum+"원 입니다");
         }
         
         else {
            System.out.println("1원 이상의 금액을 입력해주세요!");
         }
         break;
      case 3:
         
         System.out.println("얼마를 출금하시겠습니까?");
         int m = Integer.parseInt(sc.nextLine());
         
         if(m>0) {
         
            if(sum>=m) {
               sum-=m;
               System.out.println(m+"원이 출금되었습니다");
               System.out.println("현재 보유 잔액은"+sum+"원 입니다");;
            }
            else {
               System.out.println("잔액이 부족합니다");
            }
            
         }else {
            System.out.println("1원 이상의 금액을 입력해주세요!");
         }
         
         
         break;
      case 4:
         System.out.println("시뮬레이터가 종료되었습니다");
         break esc;
      default:
         System.out.println("올바른 값을 입력해주세요");
         break;
      }
      }
       
      
   }
}