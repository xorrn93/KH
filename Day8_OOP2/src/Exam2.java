import java.util.Scanner;

public class Exam2 {

   public static void main(String[] args) {
   
      Student std = new Student("Alex", 90, 40);
      
      // 값을 넣는방법 세터, 생성자
      Student[] stds = new Student[3];  
      // 인스턴스 0개 생성 Student의 주소를 가질수 있는 변수 3개를 만듬
      // Student 형 변수들의 집합

      stds[0] = new Student();  // Student 자료형         
      stds[0].setName("Tom");
      stds[0].setEng(30);
      stds[0].setKor(40);  //세터 사용으로 값넣기
      System.out.println(stds[0]);
      stds[1] = new Student("Jane", 50, 60);  //생성자 사용으로 값넣기
      System.out.println(stds[1]);
      stds[2] = std; //7번의 Alex 인스턴스르 std[2]에 넣기
      System.out.println(stds[2]);
      
      
         
      System.out.println("이름\t국어\t영어\t합계\t평균");
      for(int j = 0; j<stds.length; j++) {
//         int total = stds[j].getKor()+stds[j].getEng();
//         Double avg = total/2.0;
         System.out.println(stds[j].getName()+"\t"+stds[j].getKor()+"\t"+stds[j].getEng()+"\t"+stds[j].getTotal()+"\t"+stds[j].getAvg());
         //합계 평균을 클래스 파일의 메서드로 만듬
      }
   
   }

}