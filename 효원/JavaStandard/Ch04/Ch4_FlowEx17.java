package JavaStandard.Ch04;

import java.util.Scanner;
//사용자로부터 라인의 수를 입력받아 삼각형 모양의 별 출력
public class Ch4_FlowEx17 {
    public static void main(String[] args) {
        int num = 0;

        System.out.print("*을 출력할 라인의 수를 입력하세요.>");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();//화면을 통해 입력받은 내용을 tmp에 저장
        num = Integer.parseInt(tmp);//입력받은 문자열(tmp)을 숫자로 변환

        for(int i=0;i<num;i++) {//num(행)만큼 반복
            for(int j=0;j<=i;j++) {//i(열)만큼 반복
                //j가 i일때, i번 반복
                System.out.print("*");//가로로 출력하려면 print 메서드 사용
            }
            System.out.println();
        }//main의 끝
    }
}