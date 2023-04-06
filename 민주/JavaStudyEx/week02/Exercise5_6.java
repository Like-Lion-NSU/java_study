public class Exercise5_6 {
    public static void main(String[] args){
        int[] coinUnit = {500, 100, 50, 10}; //0,1,2,3 (4개)

        int money = 2680;
        System.out.println("money="+ money);

        for(int i=0;i<coinUnit.length;i++){ // i배열의 길이만큼 실행 i에 (0,1,2,3)들어감
            int j = (money/coinUnit[i]); // j를 money와 coinUnit[]과 나눠 몫을 동전의 개수라고 한다.
            System.out.println(coinUnit[i]+"원 : "+j); // 콘솔 출력
            int sum = coinUnit[i]*j; // for문이 돌면 그에 맞는 i와 j값을 계산하여 sum에 저장, for문이 돌수록 누적합
            money = money-sum; // 전체 값에서 위의 sum 값을 빼서 다음 연상때 money의 값을 바꿈(2680-500*5=180)=>다음 money 값이 180원이 됨
        }
        // 생각한 것 -> 수식화
        /*int a = money/500;
        int b = money%500/100;
        int c = money%100/50;
        int d = money%50/10;
        System.out.println(coinUnit[0]+"원 : "+a);
        System.out.println(coinUnit[1]+"원 : "+b);
        System.out.println(coinUnit[2]+"원 : "+c);
        System.out.println(coinUnit[3]+"원 : "+d);*/
        }
    }

