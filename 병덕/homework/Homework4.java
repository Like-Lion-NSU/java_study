import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Username {
    private String name;
    Username(String name){
        this.name=name;
    }
    public String username(){return username();}
}

class Userpower{
    private int power;
    int jpower;
    int apower;
    int tpower;
    int powersum;
    Userpower(int power) {
        this.power=power;
    }
    public int userpower(){
        powersum= jpower+apower+tpower;
        return userpower();}

}
class Userlevel {
    private int level;
    Userlevel(int level) {
        this.level=level;
    }
    public int userlevel(){return userlevel();}
}
    public class Homework4 {
        public static void main(String[] args) {

            List<Username> username = new ArrayList<>(Arrays.asList(
                    new Username("james"),
                    new Username("aclice"),
                    new Username("thomas")
            ));
            Stream<Username> names = username.stream();
                    username.stream();
            System.out.println(username);


            List<Userpower> userpower = new ArrayList<>(Arrays.asList(
                    new Userpower(3000),
                    new Userpower(4500),
                    new Userpower(3500)
            ));
            Stream<Userpower> power = userpower.stream();
            userpower.stream();
            System.out.println(userpower);


            List<Userlevel> userlevel = new ArrayList<>(Arrays.asList(
                    new Userlevel(10),
                    new Userlevel(20),
                    new Userlevel(15)

            ));
            Stream<Userlevel> level = userlevel.stream();
            userlevel.stream()
                            .filter(n->(n.length))
                                    .map(String::toUpperCase);

            System.out.println(userlevel);

        }
    }

