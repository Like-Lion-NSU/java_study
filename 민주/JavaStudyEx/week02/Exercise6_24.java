public class Exercise6_24{
    public static int abs(int value){
        if(value>=0) // 양수이면 그대로 리턴
            return value;
        else  // 음수이면 -부호를 한번 더 붙여 +로 만들고 리턴
            return -(value);
    };
    public static void main(String[] args){
        int value = 5;
        System.out.println(value+"의 절대값 : "+abs(value));
        value = -10;
        System.out.println(value+"의 절대값 : "+abs(value));
    }

}
