import java.util.Scanner;
public class Ex1_1 {
    public static void main(String args[]){
        int[] money={50000,10000,1000,100,50,10,1};

        System.out.println("금액을 입력하세요 : ");
        Scanner s = new Scanner(System.in);
        int won = s.nextInt();
        for(int i=0;i<money.length;i++){
            int count = won/money[i];
            System.out.println(money[i]+"권의 갯수 : "+count);
            won = won-count*money[i];
        }
    }
}
