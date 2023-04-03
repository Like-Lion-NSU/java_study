public class Exercise3_10 {
    public static void main(String[] args) {
        char ch = 'A';

        char lowerCase = (ch != 97) ? 'a' : ch;
        //lowerCase에 'a'가 들어가기 위해서는 조건식이 참이어야함
        //조건식이 참이므로 'a'가 저장됨


        System.out.println("ch:"+ch);
        System.out.println("ch to lowerCase:"+lowerCase);
    }
}
