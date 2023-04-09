package week03;

public class Exercise7_18 {
    public void action(Robot robot){
        if(robot = DanceRobot){
            ((DanceRobot) robot).dance();
        }
        else if(robot = SingRobot){
            ((SingRobot) robot).sing();
        } else if (robot = DrawRobot) {
            ((DrawRobot) robot).draw();
        }

    }
    public static void main(String[] args){
        Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};

        for(int i=0;i<arr.length;i++)
            action(arr[i]);
    }//main
}
class Robot{}
class DanceRobot extends Robot{
    void dance(){
        System.out.println("춤을 춥니다");
    }
}
class SingRobot extends Robot{
    void sing(){
        System.out.println("노래를 합니다");
    }
}
class DrawRobot extends Robot{
    void draw(){
        System.out.println("그림을 그립니다");
    }
}






