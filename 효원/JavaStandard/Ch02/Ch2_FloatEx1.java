package JavaStandard.Ch02;

public class Ch2_FloatEx1 {
    public static void main(String[] args) {
        float f  = 9.12345678901234567890f;
        float f2 = 1.2345678901234567890f;
        double d = 9.12345678901234567890d;

        System.out.printf("    123456789012345678901234%n");
        System.out.printf("f  : %f%n", f); //소수점 이하 6째자리까지 출력 7자리 반올림
        System.out.printf("f  : %24.20f%n", f);// 전체 24자리 중 20자리는 소수점 이하 수 출력
        System.out.printf("f2 : %24.20f%n", f2);// 원래의 값에서 7자리값만 오차없이 저장
        System.out.printf("d  : %24.20f%n", d);
    }
}
