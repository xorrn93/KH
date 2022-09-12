
public class Student {

   private String name;
   private int kor;
   private int eng;
   private int total;
   private double avg;
   //동일한 타입을 가져야하는 제약이 없다
   

   public Student() {}  
   // default Constructor 는 항상 명시하자. *필수 > 추후에 error 를 잡기 힘들어진다.
   // getter setter 와 같은 맥락
   public Student(String name, int kor, int eng) {
//	super(); 상속
	this.name = name;
	this.kor = kor;
	this.eng = eng;
}
// [alt + shift + r] + [o] Create Constructor 

   public String getName() {
      return name;
   }


public void setName(String name) {
      this.name = name;
   }


   public int getKor() {
      return kor;
   }



   public void setKor(int kor) {
      this.kor = kor;
   }



   public int getEng() {
      return eng;
   }



   public void setEng(int eng) {
      this.eng = eng;
   }
   


public int getTotal() {
	
	total = kor+eng;
	return total;
}
public void setTotal(int total) {
	this.total = total;
}
public double getAvg() {
	avg = total/2;
	return avg;
}
public void setAvg(double avg) {
	this.avg = avg;
}

@Override
public String toString() {
	return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + "]";
}

//public int Student() {
	
	
//}
//[alt + shift + r] + [S] Create toString method 
   
   

//   @Override
//   public String toString() {
//      return "Student [name=" + name+ ", kor=" + kor + ", eng=" + eng + "]";
//   }

}