package JavaStandard.Ch04;

public class Ch4_FlowEx26 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        //1를 1씩 증가시켜서 sum에 계속 더해나감
        while((sum += ++i) <= 100) {
            System.out.printf("%d - %d%n", i, sum);
        }
    }//main의 끝
}