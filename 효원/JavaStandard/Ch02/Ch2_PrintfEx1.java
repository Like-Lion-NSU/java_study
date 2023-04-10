package JavaStandard.Ch02;

public class Ch2_PrintfEx1 {
    public static void main(String[] args) {
        byte  b = 1;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_000_000_000L; // long big = 100000000000L;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL ;

        int octNum = 010; //8진수 10, 10진수로는 8
        int hexNum = 0x10; // 16진수 10, 10진수로는 16
        int binNum = 0b10; //2진수 10, 10진수로는 2

        System.out.printf("b=%d%n", b) ;// 정수 출력 시 지시자 '%d'를 사용
        System.out.printf("s=%d%n", s) ;
        System.out.printf("c=%c, %d %n", c, (int)c) ;// int 타입으로 형 변환해야만 '%d'로 출력 가능
        System.out.printf("finger=[%5d]%n", finger) ;// 5칸 확보, 우측정렬
        System.out.printf("finger=[%-5d]%n", finger) ;// 좌측정렬
        System.out.printf("finger=[%05d]%n", finger) ;// 남은 공간 0으로 채움
        System.out.printf("big=%d%n", big);
        System.out.printf("hex=%#x%n", hex); //'%x'와'%o'에 #'사용 시, 접두사(16진수 0x, 8진수 0)
        System.out.printf("octNum=%o, %d%n", octNum, octNum) ;
        System.out.printf("hexNum=%x, %d%n", hexNum, hexNum) ;
        System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum) ;
        // 10진수->2진수 지시자 X, 정수를 2진 문자열(%s)로 변환해주는 Integer.toBinaryString(int i) 사용

    }
}
