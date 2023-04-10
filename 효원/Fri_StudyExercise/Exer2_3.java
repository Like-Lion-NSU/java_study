package Fri_StudyExerise;
//거스름돈을 몇 개의 동전으로 지불할 수 있는지 계산하는 프로그램
//변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력
//단, 가능한 한 적은 수의 동전으로 거슬러 주어야함
//[Hint] 나눗셈 연산자와 나머지 연산자 사용
public class Exer2_3 {
    public static void main(String[] args) {
        //큰 금액의 동전을 우선적으로 거슬러 줘야한다.
        int [] coinUnit = {500, 100, 50, 10};

        int money = 2680;
        System.out.println("money="+money);

        for(int i=0;i<coinUnit.length;i++) {
            /*(1)*/
            System.out.println(coinUnit[i]+"원: "+(money / coinUnit[i]));
            //가능한 한 적은 수의 동전 거슬러 줘야하기 때문에 몫만 출력되는 '/' 사용
            //int a = money / coinUnit[i]
            money = money % coinUnit[i];
            //다음 계산을 위해 남은 값을 저장
        }
    }//main
}