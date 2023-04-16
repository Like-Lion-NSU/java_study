package Fri_StudyExercise;
//7-18
//instanceof연산자를 사용해서 형변환
//매서드명: action
//기능: 주어진 객체의 메서드를 호출한다
//        DanceRobot인 경우, dance()를 호출하고,
//        SingRobot인 경우, sing()를 호출하고,
//        DrawRobot인 경우, draw()를 호출한다
//반환타입: 없음
//매개변수: Robot r - Robot인스턴스 또는 Robot의 자손 인스턴스

public class Exer3_2 {
    /*(1)action 메서드를 작성하시오*/
    static void action(Robot r){//Robot타입의 참조변수 r을 매개변수로 하는 매서드
        if(r instanceof DanceRobot){//객체 타입 확인
            ((DanceRobot)r).dance();;//r 객체를 DanceRobot타입으로 형변환
            //메서드 호출
            //Q (DanceRobot)r.dance();
        } else if (r instanceof SingRobot){
            ((SingRobot)r).sing();
        } else if (r instanceof DrawRobot) {
            ((DrawRobot)r).draw();
        }
    }
    public static void main(String[] args) {
        Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};

        for(int i=0; i< arr.length; i++)
            action(arr[i]);
    }//main
}

class Robot {}

class DanceRobot extends Robot {
    void dance() {
        System.out.println("춤을 춥니다.");
    }
}

class SingRobot extends Robot {
    void sing() {
        System.out.println("노래를 합니다.");
    }
}

class DrawRobot extends Robot {
    void draw() {
        System.out.println("그림을 그립니다.");
    }
}
//instanceof 연산자
//객체타입을 검사하기 위한 연산자
//객체 타입을 확인하여 형변환 수행 가능 -> 다형성 구현에 사용





