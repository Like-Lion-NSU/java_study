package week04;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class EX4_5 {
    public static void main(String args[]){
        System.out.print("입력해 >> ");
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> info = new ArrayList<Student>();
        Student[] student = new Student[4];
        for (int i = 0; i < student.length; i++) {
            String text = sc.nextLine();
            //nextLine
            StringTokenizer st = new StringTokenizer(text, ",");
            //StringTokenizer 하나의 문자열을 여러개의 문자열 조각(토큰)으로 분리하는 것
            // (문자열, 구분자)
            String name = st.nextToken().trim();
            String major = st.nextToken().trim();
            int grade = Integer.parseInt(st.nextToken().trim());
            double score = Double.parseDouble(st.nextToken().trim());
            //nextToken()은 StringTokenizer에서 토큰을 불러오는 메서드
            //trim() : 공백제거
            student[i] = new Student(name, major, grade, score);
            info.add(student[i]);
        }

        for(int i = 0 ; i < info.size() ; i++) {
            Student save = info.get(i);
            //배열을 save로 가져옴
            System.out.println("이름:"+save.getName());
            System.out.println("학과:"+save.getMajor());
            System.out.println("학번"+save.getGrade());
            System.out.println("학점평균:"+save.getScore());
            System.out.println("---------------");
        }


        System.out.print("학생 이름 >> ");

        String search = sc.next();
        while(true){
            for(int i=0;i<student.length;i++) {
                if (search.equals(student[i])) {  //.equals로 문자열 일치여부 비교
                    Student save = info.get(i);
                    System.out.print("이름:" + save.getName());
                    System.out.print("학과:" + save.getMajor());
                    System.out.print("학번" + save.getGrade());
                    System.out.print("학점평균:" + save.getScore());
                }
                //else(search.equals("그만")){ sc.close();} 오류?!

            }
            sc.close();
        }
    }
}
class Student {
    String name;
    String major;
    int grade;
    double score;

    public Student(String name, String major, int grade, double score) {
        this.name = name;
        this.major = major;
        this.grade = grade;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public String getMajor() {
        return this.major;
    }

    public int getGrade() {

        return this.grade;
    }

    public double getScore() {

        return this.score;
    }
}