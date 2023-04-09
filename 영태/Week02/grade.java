package 영태.Week02;

public class grade {
    public static void main(String[] args) {
        Student s = new Student();  // Student 클래스 객체 s 생성
        s.name = "홍길동"; // 멤버변수 초기화
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        System.out.println("이름:"+s.name);   // 객체 s name 멤버변수 호출
        System.out.println("총점:"+s.getTotal()); // 객체 s getTotal() 호출
        System.out.println("평균:"+s.getAverage());   // 객체 s getAverage() 호출
    }
}

class Student{
    String name;        // 멤버 변수
    int ban, no, kor, eng, math;

    int getTotal(){     // 총합 메서드
        return kor+eng+math;
    }

    float getAverage(){     // 평균 메서드
        return Math.round(((float)getTotal()/3.0f)*10) / 10.0f;     // 소수점 2번째 자리 반올림 + 형변환
    }
}
