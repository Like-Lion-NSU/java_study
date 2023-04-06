package JavaStudyEx;

public class Exercise4_11 {
    public static void main(String[] args){
        int num1 = 1;
        int num2 = 1;
        int num3 = 0; //힌트를 얻음
        System.out.print(num1+","+num2);

        for(int i = 0; i<8 ; i++){
            num3 = num1 + num2; // num3을 계산, 피보나치 수열이 전의 값 2개을 더한 수이기 떄문
            System.out.print(","+ num3);
            num1 = num2; // 피보나치 수열이 전 값 2개를 더한 것이기 때문에 숫자를 하한칸씩 뒤로 저장한다고 생각
            num2 = num3; // i=0일 떄) num1=1, num2=(num3의 값)2를 받음, i=1)num1=(num2)의 값 2를 받음, num2=(num3)의 값 3의 값을 받음
        }
    }
}
