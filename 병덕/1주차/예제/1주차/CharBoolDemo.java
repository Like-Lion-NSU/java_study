package 예제;

public class CharBoolDemo {
    public static void main(String[] args){
        char ga1 = '가';
        char ga2 = '\uac00'; //유니코드

        boolean cham = true;
        boolean geojit = false;

        System.out.println(ga1);
        System.out.println((int)ga1); //변수 ga1을 int 타입으로 변환한다.
        System.out.println(ga2);
        System.out.println(++ga2); // '가'의 다음 문자인 '각'을 나타낸다.
        System.out.println(cham + "가 아니면" + geojit+ " 입니다."); // 논리타입 출력
    }
}
