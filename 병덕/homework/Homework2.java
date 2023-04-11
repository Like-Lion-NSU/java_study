import org.w3c.dom.ls.LSOutput;

import java.lang.annotation.Target;

/*학생이 학교에 가기 위한 방법으로는 버스, 지하철, 택시가 있다.
   학생과 대중교통 클래스를 만들어 학교 가는 프로그램을 구현해라.
   * 필수 - 버스, 지하철, 택시는 대중교통(부모 클래스)로부터 공통 행위 (대중교통 번호, 승객 수, 수입)을 상속 받는다.*/


    class transit{
        int transitnum ; // 대중교통의 번호
        int passengers; // 대중교통을 사용하는 인원수
        int income; // 수입

    public transit(int transitnum){ // 모든 대중교통이 번호가 필요하다고 했으니 번호를 만든다.
        this.transitnum= transitnum;
    }

    public void take(int income) { // 승객을 태우는 행동
        passengers++; // 승객을 태우면 승객이 1명씩 늘어남
        this.income = income; // 승객을 태울때 수입이 늘어나게 함
    }

}

class Taxi extends transit{ // 택시 클래스에서 transit 클래스를 상속받음
    public Taxi(int transitnum) { // 택시 번호
        super(transitnum);
    }
    public void showInfo(){ // 택시의 정보 출력
        System.out.println("택시"+transitnum+"번의 승객은"+passengers+"명이고, 수입은"+income+"원 입니다.");
    }
    public void takeTaxi(Taxi taxi){ // 택시의 비용을 학생의 돈에서 지불하고 택시의 수입을 늘리기 위함
           // 택시비
            income = 4500;
        }


}
class Subway extends transit{ //지하철
    public Subway(String transitnum) {
        super(1);
    }
    public void showInfo(){ // 지하철의 정보 출력
        System.out.println("지하철"+transitnum+"호선의 승객은"+passengers+"명이고, 수입은"+income+"원 입니다.");
    }
    public void takeSubway1(Subway subway1){
         income =1500; // 지하철 비용
    }

}
class Bus extends transit{ // 버스 클래스
    public Bus(int transitnum) { // 버스의 번호를 받기 위함
        super(transitnum);
    }
    public void showInfo(){ // 버스의 정보
        System.out.println("버스"+transitnum+"번의 승객은"+passengers+"명이고, 수입은"+income+"원 입니다.");
    }
    public void takeBus(Bus bus){ // 버스비
        income =1500;
    }
}
class Student extends transit{ // 학생 클래스
        String name; // 학생의 이름
        int money; // 학생의 돈
    public void showInfo(){ // 학생의 정보
        System.out.println(name + "의 남은 돈은 "+money+"원 입니다.");
    }
        public Student(String name, int money){ // 학생이 가져야하는 정보를 위해 생성자를 만듦
            super(1);
            this.name =name;
            this.money=money;
        }

    public void takeBus(Bus bus771) { // 학생이 버스를 탐으로 학생의 돈이 차감
        bus771.take(1500);
    }
    public void takeTaxi(Taxi taxi0406) { // 학생이 택시 를 탐으로 학생의 돈이 차감
        taxi0406.take(4500);
    }
    public void takeSubway(Subway subway1) { // 학생이 지하철를 탐으로 학생의 돈이 차감
        subway1.take(1500);
    }
}
public class Homework2 {
    public static void main(String[] args) {
        //학생 3명 생성
        Student studentKim = new Student("kim", 10000);
        Student studentLee = new Student("Lee", 45000);
        Student studentPark = new Student("Park", 5000);

        Bus bus771 = new Bus(771); // 노선 번호 771 버스 생성
        studentKim.takeBus(bus771); // kim이 771 버스탐
        studentKim.showInfo(); // kim 정보 출력
        bus771.showInfo(); //771버스 정보 출력

        Taxi taxi0406 = new Taxi(0406); // 택시 번호 0406 택시 생성
        studentLee.takeTaxi(taxi0406); //Lee가 0406 택시 탐
        studentLee.showInfo(); // Lee 정보 출력
        taxi0406.showInfo(); // 0406택시 정보 출력


        Subway subway1 = new Subway("1호선"); //1호선 지하철 생성
        studentPark.takeSubway(subway1); //Park 1호선 지하철 탐
        studentPark.showInfo(); // Park 정보 출력
        subway1.showInfo(); // 1호선 정보 출력
    }
}