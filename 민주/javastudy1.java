public class javastudy1 {
    public static void main(String[] args){
        char ch = 'A';
        char lowerCase = (ch >= 65 && ch < 97) ?  'a' : ch;

        System.out.println("ch:"+ch);
        System.out.println("ch to lowerCase:"+lowerCase);
    }
}
