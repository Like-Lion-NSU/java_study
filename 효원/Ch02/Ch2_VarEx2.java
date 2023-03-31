package Ch02;

public class Ch2_VarEx2 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int tmp = 0;// x값을 임시로 저장할 변수 선언

        System.out.println("x: "+ x + " y:" + y);// x:10 y:20

        tmp = x;// 변수 x에 저장된 값을 변수 tmp에 저장
        x = y;// x=20
        y = tmp;// y=10

        System.out.println("x: "+ x + " y:" + y);// x:20 y:10
    }
}
