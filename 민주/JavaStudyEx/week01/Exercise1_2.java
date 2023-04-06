import java.util.Scanner;

public class Exercise1_2 {
    public static void main(String[] args) {
        int total = 0;
        double score;
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요(0~100): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        total = a + b + c;
        System.out.println(total);
        score = total / 3.0;
        System.out.println(score);

        /*if(score>=90)
            System.out.println("A");
        else if (score>= 80) {
            System.out.println("B");
        }
        else if (score >=70) {
            System.out.println("C");
        }
        else if (score<=60) {
            System.out.println("D");
        }
        else{
            System.out.println("불합격");
        }*/

        switch((int) (score/10)) {
            case 10,9:
                System.out.printf("A");
                break;
            case 8:
                System.out.printf("B");
                break;
            case 7:
                System.out.printf("C");
                break;
            case 6:
                System.out.printf("D");
                break;
            default:
                System.out.printf("F");
        }
    }
}
