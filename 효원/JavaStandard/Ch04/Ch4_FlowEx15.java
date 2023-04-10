package JavaStandard.Ch04;

public class Ch4_FlowEx15 {
    public static void main(String[] args) {
        System.out.println("i \t 2*i \t 2*i-1 \t i*i \t 11-i \t i%3 \t i/3");
        System.out.println("-------------------------------------------------");

        for(int i=1;i<=10;i++)
            System.out.printf("%d \t %d \t %d \t %d \t %d \t %d \t %d%n", i, 2*i, 2*i-1, i*i, 11-i, i%3, i/3);
        //짝수, 홀수, 제곱, 역순, 순환, 반복
        //나머지 연산자 '%' 사용 시, 특정 범위의 값들이 순환하면서 반복 (1,2,0,1,2,0)
        //나누기 연산자 '/' 사용 시, 같은 값이 연속적으로 반복 (0,0,1,1,1,2,2,2)
    }
}