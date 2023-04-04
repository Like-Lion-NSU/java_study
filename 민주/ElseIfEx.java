public class ElseIfEx {
    public static void main(String args[]){
        int score = 76;
        switch(score/10) {
            case 10,9:
                System.out.printf("나의 성적 : %d(A)", score);
                break;
            case 8:
                System.out.printf("나의 성적 : %d(B)", score);
                break;
            case 7:
                System.out.printf("나의 성적 : %d(C)", score);
                break;
            case 6:
                System.out.printf("나의 성적 : %d(D)", score);
                break;
            case 5, 4, 3, 2, 1,0:
                System.out.printf("나의 성적 : %d(F)", score);
                break;
            default:
                System.out.printf("%d는 올바르지 않은 점수 입니다.", score);
        }
    }
}
