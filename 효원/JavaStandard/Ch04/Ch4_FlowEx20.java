package JavaStandard.Ch04;

//2중 반복문을 이용한 i와 j의 값을 쌍으로 출력
public class Ch4_FlowEx20 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=5;j++) {
                System.out.printf("[%d,%d]",i,j);//i와 j의 값을 쌍으로 출력
            }
            System.out.println();//줄바꿈
        }
    }//main의 끝
}