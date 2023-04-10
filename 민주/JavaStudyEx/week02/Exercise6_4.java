package week02;
public class Exercise6_4 {
    public static void main(String[] args){

        Student s = new Student(); // 객제 생성
        s.name ="홍길동"; //객제 맴버

        s.ban=1;
        s.no=1;
        s.kor=100;
        s.eng=60;
        s.math=76;

        System.out.println("이름 : "+s.name);
        System.out.println("총점 : "+s.getTotal());
        System.out.println("평균 : "+s.getAverage());
    }
}
class Student{ // class 이름 Student
    String name; // 타입 지정
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    int getTotal(){ // 생성자
        return kor+eng+math;
    } // 메소드 설정
    float getAverage(){ // 메소드 설정
        float aver=getTotal()/(float)3.0;
        float a=aver*100;
        float b=(a)%10;
        if(a-b>=5)
            return (a-b+10)/100;
        else
            return (a-b)/100;
    }
}
