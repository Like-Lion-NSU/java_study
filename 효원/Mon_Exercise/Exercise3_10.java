// 대문자를 소문자로 변경하는 코드, 문자 ch에 저장된 문자가 대문자인 경우에만 소문자로 변경한다.
// 문자코드는 소문자가 대문자보다 32만큼 더 크다.
// 예를 들어, 'A'의 코드는 65이고, 'a'의 코드는 97이다.
// (1) (2)에 알맞는 코드를 넣으시오.


package Mon_Exercise;

public class Exercise3_10 {
    public static void main(String[] args) {
        char ch = 'A';

        //char lowerCase = (1) ? (2) : ch;
        char lowerCase = (ch == 65) ? 'a' : ch;
        //lowerCase에 'a'가 들어가기 위해서는 조건식이 참이어야함
        //문자 ch에 저장된 문자가 대문자인 경우에만 소문자로 변경하기 때문에
        //ch의 코드를 활용하여 ch가 대문자인지 확인하는 조건식을 작성함


        System.out.println("ch:"+ch);
        System.out.println("ch to lowerCase:"+lowerCase);
    }
}
