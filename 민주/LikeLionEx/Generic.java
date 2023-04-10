/*public class Generic {
    public static void main(String[] args){
        Box b = new Box();//객체 생성
        b.set("Hello World ");// 문자열 삽입
        String s=(String)b.get();//object타입을 String 타입으로 형변환
        System.out.println(s);

        b.set(10);
        Integer i = (Integer)b.get();//object 타입을 Integer 타입으로 형변환
        System.out.println(i);
    }
}
class Box{
    private Object data;
    public void set(Object data){this.data=data;}
    public Object get(){return data;}
}*/
//예제
/*class Box<T>{
    private T data;//Type을 t로 받음 (정해진것 없음)
    public void set(T data){this.data=data;}
    public T get(){return data;}
}
public class Generic{
    public static void main(String[] args){
        Box<String> b = new Box<String>();
        Box<Integer> b2 = new Box<Integer>();
        b.set("Hello World ");// 문자열 삽입
        b2.set(10);
        System.out.println(b.get());
        System.out.println(b2.get());
    }
}*/
//제네릭 예제
class Container<K,V>{
    private K key;
    private V value;

    public K getKey(){
        return key;
    }
    public V getValue(){
        return value;
    }
    public void set(K key, V value){
        this.key=key;
        this.value=value;
    }
}
public class Generic{
    public static void main(String[] args){
        Container<String, String> container1 = new Container<>();
        container1.set("김민주","학생");

        Container<String, Integer> container2 = new Container<>();
        container2.set("나이", 23);

        System.out.println(container1.getKey()+":"+container1.getValue());
        System.out.println(container2.getKey()+":"+container2.getValue());
    }
}