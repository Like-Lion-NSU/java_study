package 영태.Week04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Student_Imformation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = "";
        String dept = "";
        int hakbun = 0;
        double grade = 0.0;
      /*  ArrayList<Student> students = new ArrayList<>(4);



        System.out.println("학생 이름, 학과, 학번, 학점평균을 입력하세요.");

        for(int i = 0; i<4; i++){
            System.out.print(">> ");
            name = sc.next();
            dept = sc.next();
            hakbun = sc.nextInt();
            grade = sc.nextDouble();
            Student student = new Student(name,dept,hakbun,grade);
            students.add(student);
        }

        for(Student s1 : students){
            System.out.println("-------------------");
            s1.Student_print();
        }
        System.out.println("-------------------");

        while(true){
            System.out.print("학생 이름 >> ");
            name = sc.next();
            if(name.equals("그만"))
                break;
            for(Student s2 : students){
                if(s2.getName().equals(name))
                    s2.Student_print();
            }
        }*/

        HashMap<String, Student> studentHashMap = new HashMap<>(4);
        System.out.println("학생 이름, 학과, 학번, 학점평균을 입력하세요.");
        for(int i = 0; i<4; i++){
            System.out.print(">> ");
            name = sc.next();
            dept = sc.next();
            hakbun = sc.nextInt();
            grade = sc.nextDouble();
            Student student = new Student(name,dept,hakbun,grade);
            studentHashMap.put(name,student);
        }

        for (Student s3 : studentHashMap.values()) {
            System.out.println("-------------------");
            s3.Student_print();
        }
        System.out.println("-------------------");
        while(true){
            System.out.print("학생 이름 >> ");
            name = sc.next();
            if(name.equals("그만"))
                break;
            Student s4 = studentHashMap.get(name);
            s4.Student_print();
        }
    }
}
