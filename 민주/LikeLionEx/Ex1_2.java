public class Ex1_2{
    public static void main(String[] args){
        Student studentKim = new Student("Kim", 10000);
        Student studentLee = new Student("Lee", 45000);
        Student studentPark = new Student("Park", 5000);

        Bus bus771 = new Bus(771);
        studentKim.takeBus(bus771);
        studentKim.showInfo();
        bus771.showInfo();

        Taxi taxi0406 = new Taxi(0406);
        studentLee.takeTaxi(taxi0406);
        studentLee.showInfo();
        taxi0406.showInfo();

        Subway subway1 = new Subway("1호선");
        studentPark.takeSubway(subway1);
        studentPark.showInfo();
        subway1.showInfo();
    }
}
class Student {
    String name;//Student의 이름
    int won;//Student의 돈
   public  Student(String name, int won){ // Student의 값을 받음
        this.name = name;// this 러퍼런스를 이용해 객체 자신을 메소드에 전달
        this.won = won;
    }
    public void takeBus(Bus bus){ //bus 메소드, 생성자
        bus.take(1500);
        this.won-=1500; // 버스 요금을 뺌
    }
    public void takeTaxi(Taxi taxi){
        taxi.take(4500);
        this.won-=4500;
    }
    public void takeSubway(Subway subway){
        subway.take(1500);
        this.won-=1500;
    }
    public void showInfo(){
        System.out.println(name+"남은 돈 : "+won);
    }
}
class Traff {// 부모 class
    int count=0; // 승객 수
    int num; // 교통수단 번호
    int money=0;// 교통수단 수익
}
class Bus extends Traff{// 부모 클래스(Traff)을 상속받는 자식 클래스 Bus
    Bus(int num){
        this.num=num; // 현재 객체의 num
        count++; // 승객 수 ++
         }
    public void take(int money){ // 수입을 받음
        this.money+=money; // 현재 객체의 money에 수익을 더해줌
    }
    public void showInfo(){
        System.out.println("버스 승객 : "+count+"/   수입 : "+money);
    }
}
class Taxi extends Traff{
    Taxi(int num){
        this.num=num;
        count++;
    }
    public void take(int money){
        this.money+=money;
    }
    public void showInfo(){
        System.out.println("택시 승객 : "+count+"/   수입 : "+money);
    }
}
class Subway extends Traff{
    Subway(String line){
        this.num=num;
        count++;
    }
    public void take(int money){
        this.money+=money;
    }
    public void showInfo(){
        System.out.println(num+"지하철 승객 : "+count+"/   수입 : "+money);
    }
}