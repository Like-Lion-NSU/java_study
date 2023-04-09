package 영태.Week02;

public class Coin {
    public static void main(String[] args) {
        // 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
        int[] coinUnit = {500, 100, 50, 10};        // 1차원 배열

        int money = 2680;
        System.out.println("money="+money);

        for(int i=0;i<coinUnit.length;i++){     // 배열 길이만큼
            System.out.println(coinUnit[i]+"원:"+money/coinUnit[i]);     // 배열 길이를 이용한 거스름계싼
            money=money%coinUnit[i];        // 남은 잔돈 계산
        }
    }
}
