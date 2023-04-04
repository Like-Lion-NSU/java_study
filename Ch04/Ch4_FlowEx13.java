package Ch04;

public class Ch4_FlowEx13 {
    //1부터 10까지의 합을 구하는 예제
//변수 i를 1부터 10까지 변화시키면서 i를 sum에 계속해서 누적시킴
    public static void main(String[] args) {
        int sum = 0; //합계를 저장하기 위한 변수

        for(int i=1; i <= 10; i++) {
            sum += i; //sum=sum+i;
            System.out.printf("1부터 %2d까지의 합: %2d%n", i, sum);
            //2자리 확보
        }
    }//main의 끝
}
