public class Changemoney {
    public static void main(String[] args) {
        // 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
        int[] coinUnit = {500, 100, 50, 10};

        int money = 2680;
        System.out.println("money="+money);

        for(int i=0;i<coinUnit.length;i++){

            System.out.println(coinUnit[i]+"원:"+money/coinUnit[i]);
            //500원: 100원: ~ 을 출력하기 위해 coinUnit[i] 배열을 사용하고,+로 이어주면서 문자"원"을 출력한다.
            //+로 연결해주고 money와 coin배열을 나눠 동전 개수를 구할 수 있는 식을 올려준다.
            money=money%coinUnit[i];
            // 나머지 연산자를 통해 동전의 개수를 구해준다.


        }
    }// main
}
