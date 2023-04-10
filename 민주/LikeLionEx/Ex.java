import java.util.*;

public class Ex {
    public static void main(String[] args){
        List<String> list= new ArrayList();//list 변수명, List는 인터페이스(구조만)이기 때문에 가능
        //List는 ArrayList linkedList 로 바꿀 수 있음
        list.add("Hello World");//추가
        list.add("LikeLion");
        list.remove(0);//인덱스0 값을 삭제
        // list 조건 출력
        for(int i=0;i< list.size();i++){//개선된 for문(list값을 하나씩 대조해봄, list가 끝날때까지)
            System.out.println(list.get(i));// get() 값을 가져오기
        }
        /*for(String value : list){ list를 value에다 list가 0이 될 때까지 대입
        System.out.println(value);
        }
         */
        //동일 String객첼르 가지고 있는지 boolean 값으로 출력
        System.out.println(list.contains("Hello World"));//
    }
}
//LinkedList중간에 삽입삭제 가능