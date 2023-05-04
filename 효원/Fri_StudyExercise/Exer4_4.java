package Fri_StudyExercise;

import java.util.HashMap;
import java.util.Scanner;

class Student {
   private String name;
   private String part;
   private String num;
   private Double grade;

   public Student(String name, String part, String num, double grade) {//생성자 생성
       this.name = name;//입력받은 값 저장
       this.part = part;
       this.num = num;
       this.grade = grade;
   }
   public String getName() {//메서드 생성

       return name;//이름 반환
   }
   public String getPart() {

       return part;
   }
   public String getNum() {

       return num;
   }
   public double getGrade() {

       return grade;
   }
}
public class Exer4_4 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       HashMap<String, Student> inform = new HashMap<>();//HashMap 생성
       System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
       for(int i=0;i<4;i++) {
           System.out.print(">>");
           String content = sc.nextLine();
           String[] list = content.split(",");// ","을 기준으로 나누고 배열로 저장
           String name = list[0];
           String part = list[1];
           String num = list[2];
           Double grade = Double.valueOf(list[3]);

           Student student = new Student(name, part, num, grade);//인스턴스 생성
           inform.put(name, student);//HashMap 생성(키 타입과 값 타입을 파라미터줌)
       }
       for (String name : inform.keySet()) {//모든 키를 보면서 각각 키에 대한 값을 name에 할당
           Student student = inform.get(name);//inform에서 키로 값을 가져와 student 객체 가져옴
           System.out.println("----------------------------------------");
           System.out.println("이름:"+student.getName().trim());
           System.out.println("학과:"+student.getPart().trim());
           System.out.println("학번:"+student.getNum().trim());
           System.out.println("학점평균:"+student.getGrade());
       }
       System.out.println("----------------------------------------");

       while(true) {
           System.out.print("학생 이름 >> ");
           String name = sc.nextLine();
           if (name.equals("그만")) {
               break;
           }
           Student student = inform.get(name);//키값 이용해 inform 조회, student 할당
           if (name.equals(student.getName())) {
           System.out.print(student.getName() + ",");
           System.out.print(student.getPart() + ",");
           System.out.print(student.getNum() + ",");
           System.out.print(student.getGrade() + "\n");
           }
       }
   }



