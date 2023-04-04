public class JavaQ1 {
    public static void main(String[] args) {
        char ch = 'A'; // 문자열 A 선언
        char lowerCase = (ch >= 65 && ch <= 90) ? (char)(ch + 32) : ch;
        // 문자 코드는 소문자가 대문자보다 32만큼 더 크다고 했으니 (char)형에서 (ch+32)로
        // 아스키 코드 값을 더해주는 식을 만들어준다.

        System.out.println("ch "+ch ); // ch문자와 + 변수 ch 출력
        System.out.println("ch to lowerCase:" + lowerCase); // ch to lowerCase: + 변수 lowerCase

    }
}
