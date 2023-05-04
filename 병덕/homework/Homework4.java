
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*
class Username { // 유저의 이름을 위한 클래스
    private String name;
    Username(String name){ // 생성자
        this.name=name;
    }
    public String username(){return username();}//username 리턴
}

class Userpower{ // 유저의 power을 합하기 위한 클래스
    private int power;
    int jpower; // james power
    int apower; // acilce power
    int tpower;// thomas power
    int powersum; // power 합계
    Userpower(int power) { // power 생성자
        this.power=power;
    }
    public int userpower(){ // 유저들의 총 power을 합하는 메서드
        powersum= jpower+apower+tpower;
        return userpower();
    }

}
class Userlevel { // 유저의 레벨을 위한 클래스
    private int level;
    Userlevel(int level) { // 레벨 생성자
        this.level=level;
    }
    public int userlevel(){return userlevel();} // 유저의 레벨을 int 형으로 반환하는 userlevel 메서드
}
    public class Homework4 {
        public static void main(String[] args) {

            List<Username> username = new ArrayList<>(Arrays.asList( // username Arraylist  생성
                    new Username("james"), // 유저의 이름을 하나씩 생성
                    new Username("aclice"),
                    new Username("thomas")
            ));
            Stream<Username> names = username.stream(); // 유저 네임에 관련된 스트림 생성
            username.stream()
                    .sorted()
                    .forEach(System.out::println);



            List<Userpower> userpower = new ArrayList<>(Arrays.asList(
                    new Userpower(3000), // 유저의 power을 하나씩 생성
                    new Userpower(4500),
                    new Userpower(3500)
            ));
            Stream<Userpower> power = userpower.stream();  // 유저 power에 관련된 스트림 생성
            userpower.stream();
            System.out.println(userpower);


            List<Userlevel> userlevel = new ArrayList<>(Arrays.asList(
                    new Userlevel(10), // 유저 레벨을 하나씩 생성
                    new Userlevel(20),
                    new Userlevel(15)

            ));
//            Stream<Userlevel> level = userlevel.stream();  // 유저 power에 관련된 스트림 생성
//            userlevel.stream()
//                    .filter(userlevel1->userlevel()>=15)
//                            .sorted()
//                    .map(level::userlevel)
//                    .map(username.toUpperCase());
//
//
//            System.out.println(userlevel);
//
//        }
//   }
    }
    */
class Person{
    private String name;
    private int level;
    private int power;

    Person(String name, int level, int power){
        this.name = name;
        this.level = level;
        this.power = power;
    }

    public String getName(){
        return this.name;
    }

    public int getLevel(){
        return this.level;
    }

    public int getPower(){
        return this.power;
    }

}

public class Homework4 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("James", 10, 3000));
        list.add(new Person("Alice", 20, 4000));
        list.add(new Person("Thomas", 15, 3500));

        System.out.println("[user name]");
        list.stream().forEach(p -> System.out.println(p.getName()));

        System.out.println("[user power 합계]");
        list.stream().map(Person::getPower).reduce(Integer::sum).ifPresent(System.out::println);

        System.out.println("[user level 15 이상]");
        list.stream().filter(p -> p.getLevel()>=15).map(p -> p.getName().toUpperCase()).sorted().forEach(System.out::println);
    }
}