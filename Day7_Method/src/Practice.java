
public class Practice {
	//두정수를 인수로 전달받아 나눗셈한 결과를 return 하는 Method 를 정의해보세요.
	
	// 두 정수를 나눗셈하는 Method 작성
	public static double divide(int num1, int num2) {
		
		double result = (double)(num1/num2);
		return result;
	}
	
	// Method 호출 
	public static void main(String[] args) {
		
		double result = divide(10,3);
		System.out.println(result);
	}
}
