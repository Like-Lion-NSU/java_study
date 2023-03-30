public class Ch2_CastingEx3 {
    public static void main(String[] args) {
        float f = 9.1234567f;
        double d = 9.1234567;
        double d2 = (double)f;

        System.out.printf("f =%20.18f\n", f);
        System.out.printf("d =%20.18f\n", d);
        System.out.printf("d2 =%20.18f\n", d2);
        // 변수 f와 d에 같은 값을 저장했지만 float와 double의 정밀도 차이 때문에 서로 다른 값이 저장됨

    }
}
