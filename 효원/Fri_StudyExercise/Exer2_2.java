package Fri_StudyExerise;
//구구단의 일부분을 출력하는 프로그램
public class Exer2_2 {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++) {//곱하는 수
            for (int j = 2; j <= 4; j++) {//단
                System.out.printf("%d * %d = %d\t", j, i, j * i);
            }
            System.out.println();//줄바꿈
        }
        System.out.println();//한 줄 띄기
        for(int i=1;i<=3;i++) {
            for (int j = 5; j <= 7; j++) {//단
                System.out.printf("%d * %d = %d\t", j, i, j * i);
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1;i<=3;i++) {
            for (int j = 8; j <= 9; j++) {//단
                System.out.printf("%d * %d = %d\t", j, i, j * i);
            }
            System.out.println();
        }
    }
}
// (i-1)%3 == 0일때 한 줄 띄어주기