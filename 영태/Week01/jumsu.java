package 영태.Week01;

import java.util.Scanner;

public class jumsu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 점수를 입력해주세요 : ");
        int kor = sc.nextInt();
        System.out.print("영어 점수를 입력해주세요 : ");
        int eng = sc.nextInt();
        System.out.print("수학 점수를 입력해주세요 : ");
        int math = sc.nextInt();
        int sum = kor+eng+math;
        int ave = sum/3;
//        if(ave>=90)
//            System.out.println("A입니다.");
//        else if(ave>=80)
//            System.out.println("B입니다.");
//        else if(ave>=70)
//            System.out.println("C입니다.");
//        else if(ave>=60)
//            System.out.println("D입니다.");
//        else
//            System.out.println("불합격 입니다.");
        switch(ave/10) {
            case 10, 9:
                System.out.println("A입니다.");
                break;
            case 8:
                System.out.println("B입니다.");
                break;
            case 7:
                System.out.println("C입니다.");
                break;
            case 6:
                System.out.println("D입니다.");
                break;
            default:
                System.out.println("불합격입니다.");
        }
    }
}
