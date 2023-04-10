package Fri_StudyExerise;
//피보나치 수열은 앞을 두 수를 더해서 다음 수를 만들어 나가는 수열
//ex) 1,1,2,3,5,8,13,21..
//1과 1부터 시작하는 피보나치수열의 10번째 수는 무엇인지 계산하는 프로그램
public class Exer2_1 {
    public static void main(String[] args) {
        // Fibonnaci 수열의 시작의 첫 두 숫자를 1, 1로 한다.
        int num1 = 1;
        int num2 = 1;
        int num3 = 0; //세번째 값
        System.out.print(num1+","+num2);

        for (int i =0 ; i < 8 ; i++) {
            /*(1)*/
            //앞의 두 수를 더한 값을 num3에 저장
            num3 = num1 + num2;
            System.out.print(","+num3);
            //그 다음수를 구할때
            //num2 -> num1
            num1 = num2;
            //num3 -> num2
            num2 = num3;
        }
    }//end of main
}// end of class