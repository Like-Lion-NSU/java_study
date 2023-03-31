package 예제;

public class CastDemo {
    public static void main(String []args){
        int i;
        double d;
        byte b;

        i = 7/4;
        System.out.println(i); // 정수 나눗셈이므로 1
        d = 7/4;
        System.out.println(d); // 정수 나눗셈이므로 1.0
        d = 7/ (double)4;
        System.out.println(d); // 정수와 (double)의 나눗셈 이므로 1.75

        // i=7 /(double)4 -> 타입 불일치 오류가 발생한다.

        i= 300;
        if(i < Byte.MIN_VALUE || i > Byte.MAX_VALUE)
            System.out.println("byte 타입으로 변환할 수 없습니다.");
        else
            b = (byte) i;
    }
}
