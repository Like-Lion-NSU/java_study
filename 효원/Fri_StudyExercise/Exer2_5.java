package Fri_StudyExerise;
//다음과 같이 정의된 메서드를 작성하고 테스트
//메서드명:abs
//기능:주어진 값의 절대값을 반환한다.
//반환타입:int
//매개변수:int value
public class Exer2_5 {
    /*(1)*/
    static int abs(int value){//매개변수 ()
        // 클래스에 고정되어 있는(잘 변하지 않는) 변수나 메서드 => 클래스 변수
        // 인스턴스를 생성하지 않아도 바로 호출이 가능
        // 한 클래스의 모든 인스턴스들이 공통적인 값을 유지해야하는 경우
        if (value>0){//+를 식으로 어떻게 나타내지?
            return value;//양수면 그대로 return
        } else {//아니면
            value = -value;//앞에 -를 붙여서
            return value;//절대값으로 return
        }
    }
    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절대값:" + abs(value));
        value = -10;
        System.out.println(value + "의 절대값:" + abs(value));
    }
}