package JavaStandard.Ch04;

public class Ch4_FlowEx14 {
    public static void main(String[] args) {
        for(int i=1,j=10;i<=10;i++, j--)
            //i는 1부터 10까지 증가시키고, j는 10부터 1까지 감소시킴
            System.out.printf("%d \t %d%n", i, j);
        //System.out.printf("%d \t %d%n", i, 11-i);
        //i와 j를 더한 값이 11로 일정 => j==11-i
        //변수가 적은 것이 더 효율적
    }
}