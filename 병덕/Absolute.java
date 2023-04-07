public class Absolute {
    public static int abs(int value){
        // 메서드를 작성하는 방법으로 int abs 메소드를 만든 뒤,
        // 반환값을 int value로 받는다.
        if(value >=0){ // value가 0이면 양수를 0이 아니면 음수를 출력하는 if문을 만든다
            return value; //return을 value로 받고 value를 양수로 출력한다.
        }else {
            return -value; //return을 value로 받고 value를 음수로 출력한다.
        }
    }

    public static void main(String[] args) {
        int value = 5;
        System.out.println(value+"의 절대값:"+abs(value));
        value = -10;
        System.out.println(value+"의 절대값:"+abs(value));
    }
}
