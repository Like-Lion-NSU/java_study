package 영태.Week02;


public class absolute {




    static int abs(int value){
        if(value < 0)   // 음수면
            return -value;  // 양수로
        else
            return value;   // 그대로
    }

    public static void main(String[] args) {
        int a = 1, b=101;
        int answer = (int)(Math.random() * 100) + 1;        // 0~범위 미만까지 ->  * 1 <= answer < 101
//        int answer = Random.nextInt(a, b);      // a <= answer < b 값을 랜덤하게 지정해줘
        int value = 5;
        System.out.println(value+"의 절대값:"+abs(value));
        value = -10;
        System.out.println(value+"의 절대값:"+abs(value));
    }

}
