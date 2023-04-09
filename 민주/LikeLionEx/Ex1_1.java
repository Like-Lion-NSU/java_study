import java.util.Scanner;
public class Ex1_1 {
    public static void main(String args[]) {
        int[] money = {50000, 10000, 1000, 100, 50, 10, 1};

        System.out.println("금액을 입력하세요 : ");
        Scanner s = new Scanner(System.in);
        int won = s.nextInt();
        for (int i = 0; i < money.length; i++) {
            int count = won / money[i];
            System.out.println(money[i] + "권의 갯수 : " + count);
            won = won - count * money[i];
        }
        /*int a, b, c, d, e, f, g;
        System.out.println("금액을 입력하세요 : ");
        Scanner s = new Scanner(System.in);
        int won = s.nextInt();

        a = won/50000;
        System.out.println("50000원 : "+a);
        won=won%50000;

        b = won/10000;
        System.out.println("10000원 : "+b);
        won=won%10000;

        c = won/1000;
        System.out.println("1000원 : "+c);
        won=won%1000;

        d = won/100;
        System.out.println("100원 : "+d);
        won=won%100;

        e = won/50;
        System.out.println("50원 : "+e);
        won=won%50;

        f = won/10;
        System.out.println("10원 : "+f);
        won=won%10;

        g = won/1;
        System.out.println("1원 : "+g);
        won=won%1;
    }*/
    }
}