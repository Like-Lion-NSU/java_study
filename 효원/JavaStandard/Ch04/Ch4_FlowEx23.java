package JavaStandard.Ch04;

//변수 i의 값만큼 블럭을 반복
public class Ch4_FlowEx23 {
    public static void main(String[] args) {
        int i= 5;//(4~0)

        while(i--!=0) {//0이 아닌 동안만 참
            //후위형이므로 조건식이 평가된 후에 i의 값이 감소
            System.out.println(i + " - I can do it.");//5번 출력
        }
    }//main의 끝
}