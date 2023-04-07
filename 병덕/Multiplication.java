public class Multiplication {
    public static void main(String[] args) {
        for(int i= 2; i<=9; i++){
            /* 2단부터 시작해서 9단까지 반복하기 위한 반복문
               초기값을 2로 선언하고 조건식을 i가 9보다 커지거나 같을때까지 반복*/
            for(int j=1; j<=3; j++){
                // 단 별로 3까지 곱하기 위해 j를 초깃값 1로 선언하고 j가 3보다 커지거나 같을때까지 반복
                System.out.printf("%d * %d = %d",i,j,i*j); //i와 j를 곱하는 출력문
                System.out.println(); // 개행

            }
        }
    }
}
