package Fri_StudyExerise;
//숫자맞추기 게임을 작성
//1과 100사이의 값을 반복적으로 입력해서 컴퓨터가 생각한 값을 맞추면 게임이 끝남
//사용자가 값을 입력하면, 컴퓨터는 자신이 생각한 값과 비교해서 결과를 알려줌
//사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고 몇번만에 맞췄는지 알려줌
public class Exer2_6B {
    public static void main(String[] args) {
        //1~100사이의 임의의 값을 얻어서 answer에 저장한다.
        int answer = 1/*(1)*/;
        int input = 0; //사용자입력을 저장할 공간
        int count = 0; //시도횟수를 세기위한 변수

        //화면으로부터 사용자입력을 받기 위해서 Scanner 클래스 사용
        java.util.Scanner s = new java.util.Scanner(System.in);

        do {
            count++;
            System.out.print("1과 100사이의 값을 입력하세요: ");
            input = s.nextInt(); //입력받은 값을 변수 input에 저장한다.
            /*(2)*/
            if(input < answer) {
                System.out.println("더 큰 수를 입력하세요.");
            } else if(input > answer) {
                System.out.println("더 작은 수를 입력하세요.");
            } else {
                System.out.println("맞췄습니다.");
                System.out.printf("시도횟수는 %d번입니다", count);
                break;
            }
        }while(true); //무한반복문
    }//end of main
}//end of class HighLow