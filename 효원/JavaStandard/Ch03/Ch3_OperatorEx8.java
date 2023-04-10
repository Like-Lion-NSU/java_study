package JavaStandard.Ch03;

public class Ch3_OperatorEx8 {
    public static void main(String[] args) {
        int a = 1_000_000; //1,000,000
        int b = 2_000_000; //2,000,000

        long c = a * b; // 변수 a 또는 b의 타입을 'long'으로 형변환해야한다.

        System.out.println(c);
    }
}
