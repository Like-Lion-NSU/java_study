package Ch02;

public class Ch2_StringEx {
    public static void main(String[] args) {
        String name = "Ja" + "va";//덧셈 연산자를 이용한 문자열 결합
        String str = name + 8.0;

        System.out.println(name);
        System.out.println(str);
        System.out.println(7 + " ");
        System.out.println(" " + 7);
        System.out.println(7 + "");
        System.out.println("" + 7);
        System.out.println("" + "");//내용이 없는 빈 문자열
        System.out.println(7 + 7 + "");//모두 숫자이기 때문에 두 수를 더함
        System.out.println("" + 7 + 7);//7이 string이 아니므로, 7을 String으로 변환함
    }
}
