public class Exercise718 {
class action{
    String  Dance,Sing,Draw; // 필드(데이터)
    action(){} // 기본 생성자
    action(String Dance,String  Sing,String  Draw){ // 생성자
        this.Dance=Dance; // Dance의 객체에 접근함
        this.Sing=Sing;
        this.Draw=Draw;
    }
    public void act(){
       String instanceof  DanceRobot
    }

}
    public static void main(String[] args) {
        Robot[] arr = {new DanceRobot(),new SingRobot(), new DrawRobot()};

        for(int i= 0; i< arr.length; i++){
            action(arr[i]);
        } // main
    }
    class Robot{}
    class DanceRobot extends Robot{
        void dance(){
            System.out.println("춤을 춥니다");
        }
    }

    class SingRobot extends Robot{
        void sing(){
            System.out.println("노래를 합니다.");
        }
    }

    class DrawRobot extends Robot {
        void draw(){
            System.out.println("그림을 그립니다.");
        }
    }

}
