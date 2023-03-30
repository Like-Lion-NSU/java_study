package Ch03;

public class Ch3_OperatorEx2 {
    public static void main(String[] args) {
        int i=5, j=0;

        j = i++;// 변수의 값 먼저 읽어온 후에 값 증가
        System.out.println("j=i++; 실행 후, i=" + i +", j="+ j);

        i=5; //결과를 비교하기 위해, i와 j의 값을 다시 5와 0으로 변경
        j=0;

        j=++i;//변수의 값 먼저 증가시키고 값 읽어옴
        System.out.println("j=++i; 실행 후, i=" + i +", j="+ j);
    }
}
