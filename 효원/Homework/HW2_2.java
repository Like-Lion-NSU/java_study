package Homework;
//Stream map, filter, sorted를 이용
//        1. 유저 네임 전체 출력
//        2. Power총합 출력
//        3. Level 15 이상인 유저 네임을 대문자로
//        바꾸고 정렬해서 출력

import java.util.*;
import java.util.stream.Collectors;

class Board{
    private String Name;
    private int Level;
    private int Power;

    Board(String Name, int Level, int Power) {
        this.Name = Name;
        this.Level = Level;
        this.Power = Power;
    }
    public String getName(){return this.Name;}//Name 값을 반환하는 메서드
    public int getPower(){return this.Power;}
    public int getLevel(){return this.Level;}
}
public class HW2_2 {
    public static void main(String[] args) {
        List<Board> boards = new ArrayList<>(Arrays.asList(
                new Board("James", 10, 3000),
                new Board("Alice", 20, 4000),
                new Board("Thomas", 15, 3500)
        ));

        System.out.println("[user name]");
        boards.stream()
                .map(Board::getName)//Board 클래스에서 Username 참조해서 변환
                .forEach(System.out::println);//출력

        List<Integer> Sumpower =
                boards.stream()
                        .map(Board::getPower)
                        .collect(Collectors.toList());//스트림 요소를 리스트로 수집

        System.out.println("\n[user power 합계]");
        int Sum = 0;//합계
        for (int a : Sumpower) {//(자료형 변수명 : 리스트)
            Sum += a;//power를 하나씩 더 해줌
        }
        System.out.println(Sum);

        //레벨 15이상인 사람
        System.out.println("\n[user level 15 이상]");
        boards.stream()
                .filter(board -> board.getLevel() >= 15)//getLevel로 레벨을 반환하고 15보다 크면 스트림에 포함
                .map(Board::getName)//Board에서 위 조건에 맞는 값의 이름을 가져옴
                .map(String::toUpperCase)//가져온 이름을 대문자로
                .forEach(System.out::println);
    }
}
