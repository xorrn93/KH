package midleLevel;

public class Exam1 {
	public static void main(String[] args) {
	
	System.out.println("배열예제");	
	String[] arr = new String[10];	
	arr[0] = "Hello";
	arr[1] = "World";
	arr[2] = "Collection";
//	arr[3] = 100; impossible
	
	arr[0] = arr[1];
	arr[1] = arr[2];
	arr[2] = null; // arr[0] delete
	
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	
	arr[2] = arr[1];
	arr[1] = "Hello";
	
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
	
	System.out.println(arr.length);
	}
}
