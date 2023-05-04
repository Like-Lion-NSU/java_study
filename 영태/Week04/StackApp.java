package 영태.Week04;

import java.util.Scanner;

public class StackApp extends StringStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        System.out.print("총 스택 저장 공간의 크기 입력 >> ");
        int capacity = sc.nextInt();
        StringStack stringStack = new StringStack(capacity);
        do {
            System.out.print("문자열 입력 >> ");
//            str = sc.next();
            stringStack.push(sc.next());
            System.out.println(stringStack.pop());
        }while (str != "그만");
    }

    //System.out.print("스택에 저장된 모든 문자열 팝");
    //            stringStack.pop();
}
