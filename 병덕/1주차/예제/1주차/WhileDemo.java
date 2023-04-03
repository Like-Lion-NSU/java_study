package 예제;

public class WhileDemo {
    public static void main(String []args){
        int row = 2; // 2단부터 시작
        while (row < 10){ // row값이 10보다 작을때까지 실행
            int column = 1;
            while (column < 10){ //column 값이 10보다 작을때까지 실행
                System.out.printf("%4d", row * column);
                column++;
            }
            System.out.println(); // 구구단의 각 단이 끝날 때마다 행 바꿈
            row++;
        }
    }
}
