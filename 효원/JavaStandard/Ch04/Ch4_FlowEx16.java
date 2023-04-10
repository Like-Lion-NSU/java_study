package JavaStandard.Ch04;

public class Ch4_FlowEx16 {
    //5행 10열의 별 찍기
    public static void main(String[] args) {
        for(int i=1;i<=5;i++) {//5(행)번 반복
            for(int j=1;j<=10;j++) {//10(열)번 반복
                System.out.print("*");//50번 반복(5*10)
            }
            System.out.println();
        }
    }//main의 끝
}