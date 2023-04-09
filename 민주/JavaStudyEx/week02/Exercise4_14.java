package week02;
public class Exercise4_14 {
    public static void main(String[] args){
        int answer= 76; // 76을 맞추면 break
        int input =0; // 변수 선언, 초기화, 입력을 저장
        int count =0; // 변수 선언, 초기화, 시도횟수
        //입력 받을 수 있게 Scanner클래스 사용
        java.util.Scanner s = new java.util.Scanner(System.in);
        do{  // 실행문을 먼저 실행
            count++;  //do 실행문을 걸칠 때마다 +1
            System.out.println("1~100까지의 수를 입력하세요 : ");
            input=s.nextInt();  //입력 받음
            if(input<76){  //76보다 작을 때
                System.out.println("큰 수를 입력하세요.");}
            else if(input>76){  //76보다 클 떄
                System.out.println("작은 수를 입력하세요.");}
            else if (input==76){  // 76일 때
                System.out.println("맞췄습니다");
                System.out.println(count+"번 만에 맞침");
                break; //do-while문을 벗어남
            }
        }while(true);
    }
}