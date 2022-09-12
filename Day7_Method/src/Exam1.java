
public class Exam1 {

   public static int plus(int num1, int num2) {  
      // 덧셈을 담당하는 직원(함수 function 펑션) / 메서드 / plus의 원래 자리
      // public static 객체
      
      int result = num1 + num2;
      return result; // 메서드의 기능을 끝내고 값을 돌려보내라.
   } // 사용자 정의 메서드
      
//      return num1 + num2; // 값을 돌려보내야함. 위와 표현 동일
//
//                        메서드 콜에 의해 전달되어지는 값을 받아 저장하는 변수 : 매개변수
//                        int num1, int num2 = 매개 변수이다. 소괄호 안이라서 지역 변수가 아님
//                        파라미터가 전달되어서 매개변수로 들어간다.
//                        메서드 기준 왼쪽 : 리턴 데이터 타입(int) 
//                        메서드 기준 오른쪽 : 매개변수
//                        메서드 안쪽은 실행하고자하는 코드

   //2 개의 정수를 인자값으로 받아 뺄셈한 결과를 반환하는 minus 메서드를 작성
   public static int minus(int num1, int num2) {
	   	
	   int result = num1-num2;
	   return result;
	   
   }
   
   //2 개의 정수를 인자값으로 받아 곱셈한 결과를 반환하는 mply 메서드를 작성해보세요.
   public static int mply(int num1, int num2) {
	   	
	   int result = num1*num2;
	   return result;
	   
   }
   //2 개의 정수를 인자값으로 받아 나눗셈한 결과를 double 형으로 반환하는 divide 메서드를 작성해보세요
   
   public static double divide(int num1, int num2) {
	   
	   double result = (double)(num1/num2);
	   return result;
   }
  
   public static void main(String[] args) { // 메인은 프로그램 시작점 / 본격적 코드는 main에 담지않음. 코드 밖에 짬
                                 // 메인 사장님
//      System.out.println(10 + 5);
//      
//      plus(10,5) // 덧셈이 필요할 때 직원을 부름 / 메서드를 콜한다. 메서드콜
//               // 제어문옆에 붙어있는 소괄호만 아니라면 메서드콜 전부 가능
//      
//      plus() // 전달할 값 없으면
//      plus(10,5) // 전달할 값 있으면 / Method 를 Call 하며 전달하는 값을 인자값(parameter 파라미터) = 10,5
//      
//      
//      15 // 코드상에서 plus(10,5)로 보이긴함
//         // 복귀하면 plus(10,5)를 지우고 15만 남김 
	   
	   String str = "hello world";
	   System.out.println(str.length()+"개"); // String 의 문자개수 반환
	   System.out.println(str.charAt(1)); // String 의 인덱스 번호 에 해당하는 char 값을 반환
	   System.out.println(str.startsWith("hello")); // String 이 매개변수 로 시작하는지
	   System.out.println(str.contains("hello")); // String 이 매개변수를 포함 하는지
	   System.out.println(str.equals("hello world")); // String이 매개변수와 같은지
	   System.out.println(str.indexOf("w")); // w의 인덱스번호 반환
	   
	   String [] arr = str.split(" "); // String 을 띄어쓰기를 기준으로 나누고 배열에 담는다.
	   // 기준인 띄어쓰기는 소멸한다.
	   System.out.println(arr[0]);
	   System.out.println(arr[1]);
	   
      int result = plus(10,5); // 그래서 자료형이 아니라 int 형이다. 
      // 코드흐름이 위로, 위에서 계산하고 리턴, 원래 자리에, 그리고 result 에 값이 저장 끝
      System.out.println(result);
      
      int result2 = minus(10,5);
      System.out.println(result2);
      
      int result3 = mply(10,5);
      System.out.println(result3);

      double result4 = divide(10,3);
      System.out.println(result4);
      
      
//      System.out.println(); 메서드
//      sc.nextLine(); 내장 메서드 = 이미 누군가가 만들어 놓은걸 call 한다
      
        // sc.nexLine() 실제 코드 :
//      public static String nextLine() {
    	  
//      }
      
      	// parseInt() 실제코드:
//      public static int parseInt() {
      		
//      }// int 형 변수 1개
      
      Math.random();
      // 파라미터가 없음 > double 형 리턴값 
      
   }
}