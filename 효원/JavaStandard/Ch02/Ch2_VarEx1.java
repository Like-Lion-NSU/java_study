package JavaStandard.Ch02;

public class Ch2_VarEx1 {
    public static void main(String[] args) {
        int year = 0;// year 변수 선언, 년도는 정수이므로 int로 지정
        int age = 14;

        System.out.println(year);//화면에 글자를 출력하기 위한 println()
        System.out.println(age);

        year = age + 2000;//변수 age에 저장한 값에 2000을 더한 다음, year에 저장
        age = age + 1;//변수의 값을 읽어다 1을 더한 후 age에 저장

        System.out.println(year);
        System.out.println(age);
    }
}
