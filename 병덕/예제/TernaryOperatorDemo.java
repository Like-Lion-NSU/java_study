package 예제;

public class TernaryOperatorDemo {
    public static void main(String []args){
        int x = 1;
        int y;
        y = (x == 1) ? 10 : 20; // x==1이 true 이므로 y에 10을 대입
        System.out.println(y);
        y = (x > 1) ? x++ : x+20; //x > 1 이 거짓이므로 y에 20의 값을 대입 (x++는 수행하지 않음)
        System.out.println(x);
        System.out.println(y);
    }
}
