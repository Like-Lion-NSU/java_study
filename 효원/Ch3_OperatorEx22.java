public class Ch3_OperatorEx22 {
    public static void main(String[] args) {
        float f = 0.1f;// f에 0.10000000149011612로 저장
        double d = 0.1;// d에 0.10000000000000001로 저장
        double d2 = (double)f;// 형변환해서 저장해도, 그대로 d2에 저장

        System.out.printf("10.0==10.0f %b%n", 10.0==10.0f);
        System.out.printf("0.1==0.1f  %b%n", 0.1==0.1f);
        //정수형과 달리 실수형은 근사값으로 저장되므로 오차 발생
        System.out.printf("f =%19.17f%n", f);
        System.out.printf("d =%19.17f%n", d);
        System.out.printf("d2 =%19.17f%n", d2);
        System.out.printf("d==f %b%n", d==f);
        System.out.printf("d==d2 %b%n", d==d2);
        System.out.printf("d2==f %b%n", d2==f);
        System.out.printf("(float)d==f %b%n", (float)d==f);
    }
}
