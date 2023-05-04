package 영태.Week04;

public class StringStack implements Stack{

    public int capacity;
    public int top = 1;
    String stack[];

    public StringStack(){}

    public StringStack(int capacity){
        String stack[] = new String[capacity];
    }

    @Override
    public int length(){
        return top;
    }

    @Override
    public int capacity() {
        return stack.length;
    }

    @Override
    public String pop() {
        if(stack != null) {
            return stack[top--];
        }
        else return null;
    }

    @Override
    public boolean push(String val) {
        if(stack != null) {
            if (top > capacity) {
                System.out.println("스택이 꽉 차서 푸시 불가!");
                return true;
            }
            else if (top <= capacity) {
                stack[top-1] = val;
                top++;
                System.out.println(top);
                return true;
            } else return true;
        }
        return false;
    }

}
