public class Exercise6 {
    public static void main(String[] args) {
        Student s=new Student();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        System.out.println("이름:" +s.name);
        System.out.println("총점:" +s.getTotal());
        System.out.println("평균:" +s.getAverage());
    }
}
class Student {
    String name; //main 함수에 있는 s.~ 을 Student 클래스에서 선언
    int no, ban, kor, eng, math;


    int getTotal() {
        return kor + eng + math; //국영수 점수를 합하는 메서드를 만듦.
    }

    float getAverage() {
        // return float(getTotal()/3f );
        //소수점 둘째자리에서 반올림 하는법을 모르겠어요 ㅠㅠ..
    }
}
