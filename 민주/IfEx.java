import java.util.Scanner;

public class IfEx {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수 입력(0~100) : ");
        int score = scanner.nextInt();
        int a;
        int b;
        a=score/10;
        b=score%10;
        if(a==b){
            System.out.println("같습니다");
        }
        else{
            System.out.println("틀립니다");
        }
    }
}