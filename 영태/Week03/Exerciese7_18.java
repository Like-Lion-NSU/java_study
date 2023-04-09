package 영태.Week03;

public class Exerciese7_18 {

        public static void action(Robot r) {
            if (r instanceof DanceRobot){       // r이 DanceRobot 객체인지
                DanceRobot danceRobot = new DanceRobot();
                danceRobot.dance();
            }
            else if(r instanceof SingRobot){       // r이 SingRobot 객체인지
                SingRobot singRobot = new SingRobot();
                singRobot.sing();
            }
            else if(r instanceof DrawRobot){       // r이 DrawRobot 객체인지
                DrawRobot drawRobot = new DrawRobot();
                drawRobot.draw();
            }
            else        // 위 객체들이 아니면
                System.out.println("아무것도 안합니다.");
        }


    public static void main(String[] args) {
        Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};    // 객체의 배열

        for(int i = 0; i<arr.length; i++)       // 0~2까지 반복  * 인텍스 = 배열 길이 - 1
            action(arr[i]);
    }
}

class Robot{}

class DanceRobot extends Robot{
    void dance(){
        System.out.println("춤을 춥니다.");
    }
}

class SingRobot extends Robot{
    void sing(){
        System.out.println("노래를 합니다.");
    }
}

class DrawRobot extends Robot{
    void draw(){
        System.out.println("그림을 그립니다.");
    }
}