package JavaStandard.Ch03;

public class Ch3_OperatorEx9 {
    public static void main(String[] args) {
        long a = 1_000_000 * 1_000_000;
        long b = 1_000_000 * 1_000_000L;

        System.out.println("a="+a); //int의 최대값을 넘어서 오버플로우 발생
        System.out.println("b="+b); // long타입과 int타입의 연산 -> long 타입

    }
}
