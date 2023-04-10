package JavaStandard.Ch04;

//중첩 for문을 이용한 구구단 출력
public class Ch4_FlowEx18 {
    public static void main(String[] args) {
        for (int i=2;i<=9;i++) {//안쪽 for문을 8번(2~9단)
            for(int j=1;j<=9;j++) {//하나의 단(곱하는 수) 출력, 문장이 하나면 괄호 생략 가능
                System.out.printf("%d x %d = %d%n",i,j,i*j);
            }
        }
    }//main의 끝
}