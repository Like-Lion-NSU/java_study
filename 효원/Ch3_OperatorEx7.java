public class Ch3_OperatorEx7 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 30;
        byte c = (byte)(a * b);
        // 300은 byte의 범위를 넘기 때문에 byte형으로 변환하면
        // 데이터손실이 발생하여 결국 44가 byte형 변수 c에 저장
        System.out.println(c);
    }
}
