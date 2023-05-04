//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Scanner;
//class Students{
//    private String name;
//    private String major;
//    private String hok;
//    private double avg;
//
//    public Students(String name, String major, String hok, double avg) { // 생성자
//        this.name = name;
//        this.major = major;
//        this.hok = hok;
//        this.avg = avg;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getMajor() {
//        return major;
//    }
//
//    public String getHok() {
//        return hok;
//    }
//
//    public double getAvg() {
//        return avg;
//    }
//}
//public class Exercise5 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        HashMap<String, Students> stu = new HashMap<String, Students>();
//        //ArrayList<Students> stu = new ArrayList<Students>();
//        System.out.println("학생 이름, 학과, 학번, 학점 평균을 입력하세요.");
//        for (int i = 0; i < 4; i++) {
//            System.out.print(">>");
//            String name = sc.next();
//            String major = sc.next();
//            String hok = sc.next();
//            double avg = sc.nextDouble();
//            Students students = new Students(name,major,hok,avg);
//            //stu.add(students);
//            stu.put(name, students);
//
//
//        }
//
//        for(int i =0; i<stu.size(); i++){
//            Students st = stu.get(i);
//
//            System.out.println("--------------------------");
//            System.out.println("이름 : " + st.getName());
//            System.out.println("학과 : " + st.getMajor());
//            System.out.println("학과 : " + st.getHok());
//            System.out.println("학과 : " + st.getAvg());
//            System.out.println("--------------------------");
//        }
//        while (true){
//            System.out.print(" 학생 이름 >>");
//            String InName = sc.next();
//            if(InName.equalsIgnoreCase("그만"));
//            break;
//
//        }
//
//    }
//}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
class Students{
    private String name;
    private String major;
    private String hok;
    private double avg;

    public Students(String name, String major, String hok, double avg) { // 생성자
        this.name = name;
        this.major = major;
        this.hok = hok;
        this.avg = avg;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public String getHok() {
        return hok;
    }

    public double getAvg() {
        return avg;
    }
}
public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Students> stu = new ArrayList<Students>();
        System.out.println("학생 이름, 학과, 학번, 학점 평균을 입력하세요.");
        for (int i = 0; i < 4; i++) {
            System.out.print(">>");
            String name = sc.next();
            String major = sc.next();
            String hok = sc.next();
            double avg = sc.nextDouble();
            Students students = new Students(name,major,hok,avg);
            stu.add(students);
        }

        for(int i =0; i<stu.size(); i++){
            Students st = stu.get(i);

            System.out.println("--------------------------");
            System.out.println("이름 : " + st.getName());
            System.out.println("학과 : " + st.getMajor());
            System.out.println("학과 : " + st.getHok());
            System.out.println("학과 : " + st.getAvg());
            System.out.println("--------------------------");
        }
        while (true){
            System.out.print(" 학생 이름 >>");
            String InName = sc.next();
            if(InName.equalsIgnoreCase("그만"));
            break;

        }

    }
}