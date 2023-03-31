package 예제;

public class BreakDemo {
    public static void main(String[] args) {
        int i = 1, j = 5;

        while (true) { // 무한반복
            System.out.print(i++);
            if (i >= j)
                break;
        }
    }
}
