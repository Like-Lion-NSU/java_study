package 영태.Week01;

public class charop {
    public static void main(String[] args) {
        char ch = 'A';

        char lowerCase = (((int)ch<97) ? 'a' : ch);

        System.out.println("ch:"+ch);
        System.out.println("ch to lowerCase:"+lowerCase);
    }
}
