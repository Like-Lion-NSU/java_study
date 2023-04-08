import java.lang.annotation.Target;

/*학생이 학교에 가기 위한 방법으로는 버스, 지하철, 택시가 있다.
   학생과 대중교통 클래스를 만들어 학교 가는 프로그램을 구현해라.
   * 필수 - 버스, 지하철, 택시는 대중교통(부모 클래스)로부터 공통 행위 (대중교통 번호, 승객 수, 수입)을 상속 받는다.*/


    class transit{
    String transitnum ;
    int passengers;
    int income;

        void transit(){;}
        void passengers(){;}
        void income(){;}


}

class Taxi extends transit{
    String Taxinum;
}
class Subway extends transit{
    String Subwaynum;
}
class Bus extends transit{
    String Busnum;
}
class Student extends transit{
    String name;
    String money;

}
public class Homework2 {
    public static void main(String[] args) {
        //학생 3명 생성
        Student studentKim = new Student("kim", 10000);
        Student studentLee = new Student("Lee", 45000);
        Student studentPark = new Student("Park", 5000);

        Bus bus771 = new Bus(771); // 노선 번호 771 버스 생성
        studentKim.takeBus(bus771); // kim이 771 버스탐
        studentKim.showInfo(bus771); // kim 정보 출력
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
