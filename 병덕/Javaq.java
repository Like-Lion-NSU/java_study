import java.util.Scanner;

public class Javaq {
    public static void main(String[] args) {
        int kor,eng,mat;
        int sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("국어 점수를 입력하세요 : ");
        kor = sc.nextInt();
        System.out.println("영어 점수를 입력하세요 : ");
        eng = sc.nextInt();
        System.out.println("수학 점수를 입력하세요 : ");
        mat = sc.nextInt();
        sum = kor + eng + mat;

        if(sum/3 >= 90) {
            System.out.println("A 입니다");
        }else if (sum/3 >= 80) {
            System.out.println("B 입니다");
        }else if(sum/3 >= 70) {
            System.out.println("C 입니다");
        }else if(sum/3 >= 60) {
            System.out.println("D 입니다");
        }else {
            System.out.println("불합격입니다");
        }

//        switch ((sum/3)){
//            case 100:
//            case 90:
//                System.out.println("A");
//                break;
//            case 80:
//                System.out.println("B");
//                break;
//            case 70:
//                System.out.println("C");
//                break;
//            case 60:
//                System.out.println("D");
//                break;
//            default:
//                System.out.println("불합격입니다.");
//                break;

          }

    }

