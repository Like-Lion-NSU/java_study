import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class Ex2_2 {
    public static void main(String[] args) {
        List<Board> info = new ArrayList<>();
                info.add (new Board("james", 10, 3000));
                info.add (new Board("alice", 20, 4000));
                info.add (new Board("tomas", 15, 3500));
        System.out.println("[user name]");
        info.stream()
                .map(boards ->boards.getName())
                .forEach(System.out::println);
        System.out.println("[user power 합계]");
        int sum = info.stream().mapToInt(Board::getPower).sum();
        System.out.println(sum);
        System.out.println("[user level 15 이상]");
        info.stream()
                .filter(Board->Board.getLevel()>=15)
                .map(Board::getName)
                .map(String::toUpperCase)
                .sorted()//?
                .forEach(name->System.out.println(name));
    }

}
class Board{
     String name;
     int level;
     int power;

    Board(String name, int level, int power){
        this.name = name;
        this.level = level;
        this.power = power;
    }

    public String getName(){
        return this.name;}
    public int getLevel(){
        return this.level; }
    public int getPower(){
        return this.power;
    }
}
