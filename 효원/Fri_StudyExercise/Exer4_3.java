package Fri_StudyExercise;

import java.util.ArrayList;
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
public class Exer4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> inform = new ArrayList<>();
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
            inform.add(student);//리스트에 입력된 정보 student에 저장
            }
            for (int i=0;i<4;i++){
                Student student = inform.get(i);//변수에 할당
                 System.out.println("----------------------------------------");
                 System.out.println("이름:"+student.getName().trim());//trim(), 공백을 제거해줌
                 System.out.println("학과:"+student.getPart().trim());//getPart()를 통해 학과 조회
                 System.out.println("학번:"+student.getNum().trim());
                 System.out.println("학점평균:"+student.getGrade());//Q. 왜 trim을 사용할 수 없나요?
                 }
                 System.out.println("----------------------------------------");

            while(true) {
                System.out.print("학생 이름 >> ");
                String name = sc.nextLine();
                if (name.equals("그만")) {
                    break;
                }

                for (int i = 0; i < inform.size(); i++) {
                    Student student = inform.get(i);//i번째에 있는 student 정보가져옴
                    if (name.equals(student.getName())) {
                        System.out.print(student.getName() + ",");
                        System.out.print(student.getPart() + ",");
                        System.out.print(student.getNum() + ",");
                        System.out.print(student.getGrade() + "\n");
                    }
                }
            }
        }
    }


