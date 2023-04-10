package JavaStandard.Ch04;

//for문을 이용해 시간 지연
public class Ch4_FlowEx24 {
    public static void main(String[] args) {
        int i = 11;

        System.out.println("카운트다운을 시작합니다.");

        while (i-- != 0) {//10부터 0까지 1씩 감소시켜가면서 출력을 하되
            System.out.println(i);

            for (int j = 0; j < 2_000_000_000; j++) {//매 출력마다 약간의 시간 지연
                //조건식과 증감식을 2_000_000_000번 반복하며 시간 지연
                ; //생략가능
            }
        }
        System.out.println("GAME OVER");
    }
}
//for문 끝에 ;붙이면 단 한번만 수행됭