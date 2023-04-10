import java.util.ArrayList;//*을 쓰면 모두 참조

class Book{
    String title;
    int price;

    public Book(){} // 기본생성자
    public Book(String title, int price){
        this.title=title; // this는 class의 값, title은
        this.price=price;
    }
    public void showPrice(){
        System.out.println(title+"의 가격은 "+price+"원 입니다");
    }
}

public class Array2 {
    public static void main(String[] args){
        ArrayList<Book> library = new ArrayList<>();//Book은 창조타입, ArrayList = class
        library.add(new Book("국어책",3000));
        library.add(new Book("영어책",4000));
        library.add(new Book("수학책",5000));
        for (int i=0;i< library.size();i++){//문자열의 길이:length.{}/리스트 길이:size()
            library.get(i).showPrice();
        }
    }
}
// 검색하기 쉬움