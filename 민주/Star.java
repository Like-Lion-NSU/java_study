import java.util.Scanner;

public class Star {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수 입력(0~100) : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int Max;
        if(a>b){
            Max =a;
            if(Max>c)
                System.out.print(Max);
            else
                System.out.println(c);
        } else  {
            Max =b;
            if(Max>c)
                System.out.print(Max);
            else
                System.out.println(c);

        }

    }
}