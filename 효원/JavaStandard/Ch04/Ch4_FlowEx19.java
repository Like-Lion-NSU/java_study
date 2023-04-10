package JavaStandard.Ch04;

//3개의 반복문이 중첩되어 있는 경우 어떤 순서로 수행되는지
public class Ch4_FlowEx19 {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++)//모두 27번 반복(3*3*3)
            for(int j=1;j<=3;j++)
                for(int k=1;k<=3;k++)//가장 안쪽부터 실행되는 것을 확인
                    System.out.println(""+i+j+k);
        //기본형 타입의 값을 문자열로 변환할 때는 빈 문자열("")을 더해주면 됨
    }//main의 끝
}