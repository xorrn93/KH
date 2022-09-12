
public class Quiz1 {
	public static void main(String[] ar) {
		
		byte b = 10;
		short s = 20;
		char c = 'A';
		int i;
		float f;
		long l = 100L;
//		
//		s=b;
//		c=b; //error
//		s=c; //error
//		c=s; //error
//		i=100L; //error
//		l=500;
//		f=l;
//		f=5.11; //error
		
		s=b;
		c=(char)b; 
		s=(short)c; 
		c=(char)s; 
		i=100; 
		l=500;
		f=l;
		f=(float)5.11; 
		
		System.out.println(s);
		System.out.println(c);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		
		
		

	}
}
