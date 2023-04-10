package Homework;

import java.util.Scanner;

public class HW1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Scanner 클래스의 객체 생성
        System.out.printf("금액을 입력하시오>>");
        int input = scanner.nextInt();//입력받은 값을 input에 저장

        int oman = 0, man = 0, cheon = 0, baeg = 0, fifty = 0, ten = 0, one = 0;
        //int oman, man, cheon, baeg, fifty, ten, one = 0;(X)
        while (input != 0) {
            //if문만 실행되면 조건 충족시 빠져나오기 때문에 반복을 시켜주어야 함
            //조건식만 사용해도 되는 while 사용
            if (input >= 50000) {//입력받은 값이 5만원 이상일 때
                oman = input / 50000;//나눗셈 연산자로 몫을 구하고 출력을 위해 oman에 저장
                input = input % 50000;//다음 계산을 위해 남은 값을 저장
            } else if (input >= 10000) {
                man = input / 10000;
                input = input % 10000;
            } else if (input >= 1000) {
                cheon = input / 1000;
                input = input % 1000;
            } else if (input >= 100) {
                baeg = input / 100;
                input = input % 100;
            } else if (input >= 50) {
                fifty = input / 50;
                input = input % 50;
            } else if (input >= 10) {
                ten = input / 10;
                input = input % 10;
            } else {
                one = input / 1;
                input = input % 1;
            }
        }
        System.out.printf("오만원권 %d장\n", oman);//위에서 저장한 개수를 출력
        System.out.printf("만원권 %d장\n", man);
        System.out.printf("천원권 %d장\n", cheon);
        System.out.printf("백원 %d개\n", baeg);
        System.out.printf("오십원 %d개\n", fifty);
        System.out.printf("십원 %d개\n", ten);
        System.out.printf("일원 %d개\n", one);
    }
}
//Q: 왜 if문에 프린트문을 바로 넣어주면 0개는 출력되지 않는가?
//if문에 넣는 것을 제외한 경우(주석처리)에는 모두 0이 출력되었음

//실행됨
//        oman = input / 50000;
//        input = input % 50000;
//        System.out.printf("오만원권 %d장\n", oman);
//
//        man = input / 10000;
//        input = input % 10000;
//        System.out.printf("만원권 %d장\n", man);
//
//        cheon = input / 1000;
//        input = input % 1000;
//        System.out.printf("천원권 %d장\n", cheon);
//
//        baeg = input / 100;
//        input = input % 100;
//        System.out.printf("백원 %d개\n", baeg);
//
//        fifty = input / 50;
//        input = input % 50;
//        System.out.printf("오십원 %d개\n", fifty);
//
//        ten = input / 10;
//        input = input % 10;
//        System.out.printf("십원 %d개\n", ten);
//
//        one = input / 1;
//        input = input % 1;
//        System.out.printf("일원 %d개\n", one);


// 왜 0개는 실행되지 않는가?
//        while (input != 0) {
//            if (input >= 50000) {
//                oman = input / 50000;
//                input = input % 50000;
//                System.out.printf("오만원권 %d장\n", oman);
//            } else if (input >= 10000) {
//                man = input / 10000;
//                input = input % 10000;
//                System.out.printf("만원권 %d장\n", man);
//            } else if (input >= 1000) {
//                cheon = input / 1000;
//                input = input % 1000;
//                System.out.printf("천원권 %d장\n", cheon);
//            } else if (input >= 100) {
//                baeg = input / 100;
//                input = input % 100;
//                System.out.printf("백원 %d개\n", baeg);
//            } else if (input >= 50) {
//                fifty = input / 50;
//                input = input % 50;
//                System.out.printf("오십원 %d개\n", fifty);
//            } else if (input >= 10) {
//                ten = input / 10;
//                input = input % 10;
//                System.out.printf("십원 %d개\n", ten);
//            } else {
//                one = input / 1;
//                input = input % 1;
//                System.out.printf("일원 %d개\n", one);
//            }
//        }