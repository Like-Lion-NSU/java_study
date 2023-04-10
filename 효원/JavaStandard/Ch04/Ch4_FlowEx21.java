package JavaStandard.Ch04;

//2중 for문에 if문을 넣어서 조건식 'i==j'를 만족하는 경우에만
//i와 j의 값을 출력하고 나머지는 공백을 출력
public class Ch4_FlowEx21 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=5;j++) {
                if(i==j) {
                    System.out.printf("[%d, %d]", i ,j);
                } else {
                    System.out.printf("%5c",' ');//char 문자 1개를 5만큼 공백 출력
                }
            }
            System.out.println();
        }
    }//main의 끝
}
//숫자쌍 대신 별을 찍으면 별찍기
//해당 숫자쌍 모두 표시한 뒤 공통점 찾고 조건식으로 표현