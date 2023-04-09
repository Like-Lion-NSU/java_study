import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount; // 총 금액
        int fift,tent,onet,fiveh,oneh,fif,ten,one; // 각각 거스름 돈을 받기 위한 변수
        System.out.print("금액을 입력하시오 >> ");
        amount = sc.nextInt();
        fift = amount / 50000;
        //(오만원 거스름돈) ex) 78239 / 50000 = 1 5만원권의 개수 출력
        tent = amount % 50000 / 10000;
        //(만원 거스름돈) ex) 78239 % 50000 = 28239, 28239/10000 = 2 만원권의 개수 출력
        onet = amount %10000 / 1000;
        //(천원 거스름돈) ex)78239 % 10000= 8239, 8239 / 1000 = 8  천원권의 개수 출력
        fiveh = amount % 50000 % 1000 / 500;
        // (오백원 거스름돈) ex)78239 % 50000 = 28239, 28239 % 1000 =239, 239 / 500 = 0.~~~ 5백원의 개수이지만 몫으로 나눠지지 않고 소수점으로 나눠지기 때문에 개수는 0
        oneh = amount % 50000 % 1000 % 500 / 100;
        //(백원 거스름돈)ex)78239 % 50000 = 28239, 28239 % 1000 =239, 239 / 100 = 2 100원의 개수 출력
        fif = amount %100 /50;
        //(오십원 거스름돈) ex)78239 % 100 = 39, 39/50 = 0 몫이 0 이니까 50원의 개수는 없음
        ten = amount % 50 / 10;
        // (십원 거스름돈) ex)78239 % 100 = 39, 39/10 = 3 10을 나누면 몫은 3 이니까 10원의 개수는 3
        one = amount %10;
        // (일원 거스름돈) ex)78239 % 10 = 9 10원의 개수 출력
        // 나눗셈과 나머지 연산자를 이용해서 계산식을 만들고 값을 각 변수에 대입하여 거스름돈의 반환값을 구하는 식

        System.out.println("오만원권: " +fift ); // 거스름 돈을 받는 식을 이용해 값을 출력함
        System.out.println("만원권: " + tent);
        System.out.println("천원권: " + onet);
        System.out.println("오백원: " + fiveh);
        System.out.println("백원: " + oneh );
        System.out.println("오십원: " + fif );
        System.out.println("십원: " + ten);
        System.out.println("일원: " + one );
    }
}
