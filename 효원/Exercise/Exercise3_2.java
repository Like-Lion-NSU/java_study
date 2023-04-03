//  국어, 영어, 수학 세 과목의 시험 점수를 입력받아 총점과 평균을 구하고, 
//  평균이 60점 이상인 경우에 "합격입니다." 메시지를 출력하고, 
//  60점 이상이 아닌 경우에 "불합격입니다." 메시지를 출력한다.

package Exercise;

import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {
       

//          for문 이용
//        Scanner scanner = new Scanner(System.in);//Scanner클래스의 객체를 생성
//        System.out.print("국어: ");
//        int korean = scanner.nextInt();//입력받은 내용을 korean에 저장
//        System.out.print("영어: ");
//        int english = scanner.nextInt();
//        System.out.print("수학: ");
//        int math = scanner.nextInt();
//
//        int avr = (korean + english + math) / 3;
        //평균값 저장
//
//        if (avr >= 90) {// 평균이 90점 이상이면
//            System.out.println("A");// A 출력
//        } else if (avr >= 80) {
//            System.out.println("B");
//        } else if (avr >= 70) {
//            System.out.println("C");
//        } else if (avr >= 60) {
//            System.out.println("D");
//        } else {//어느 조건식도 만족하지 않았으면
//            System.out.println("불합격입니다.");//불합격입니다 출력
//        }
        //Switch를 이용
        Scanner scanner = new Scanner(System.in);//Scanner클래스의 객체를 생성
        System.out.print("국어: ");
        int korean = scanner.nextInt();//입력받은 내용을 korean에 저장
        System.out.print("영어: ");
        int english = scanner.nextInt();
        System.out.print("수학: ");
        int math = scanner.nextInt();
        int avr = ((korean + english + math) / 3)/10;
        // 평균을 구하고 case를 나누기 위해 10을 나눔

        switch (avr) {
            case 9:// 몫이 9면 90점 이상이며 avr의 결과가 9와 같으면
                System.out.println("A");// A 출력
                break;// 이어서 동작될 수 있기 때문에 break를 아용하여 빠져나감
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:// 일치하는 case문이 없을 때
                System.out.println("불합격입니다.");// 불합격입니다. 출력
        }

    }
}
