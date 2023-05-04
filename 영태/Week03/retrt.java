package 영태.Week03;

import java.util.*;

public class retrt {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
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
class Student{
    private String name;
    private int coin;

    Student(){};
    Student(String name, int coin){
        this.name = name;
        this.coin = coin;
    }
    void showInfo(){
        System.out.println(this.name+"의 남은 돈은 "+this.coin+"원 입니다.");
    }
    void takeBus(Bus b) {
        b.people++;
        b.income = b.income + 1500;
        if(this.coin < 1500) {
            System.out.println("가진돈이 부족합니다.");
        }else {
            this.coin = coin - b.income;
        }
    }
    void takeTaxi(Taxi t) {
        t.people++;
        t.income = t.income + 4500;
        if(this.coin < 4500) {
            System.out.println("가진돈이 부족합니다.");
        }else {
            this.coin = coin - t.income;
        }
    }
    void takeSubway(Subway s) {
        s.people++;
        s.income = s.income + 1500;
        if(this.coin < 1500) {
            System.out.println("가진돈이 부족합니다.");
        }else {
            this.coin = coin - s.income;
        }
    }
}

class PublicTransfer{
    protected int num;
    protected int people;
    protected int income;
}

class Bus extends PublicTransfer{
    Bus(){};
    Bus(int num){
        this.num = num;
    }
    void showInfo() {
        System.out.println("버스"+this.num+"번의 승객은 "+ this.people+"명이고, 수입은 "+this.income+"원 입니다.");
    }
}

class Taxi extends PublicTransfer{
    Taxi(){};
    Taxi(int num){
        this.num = num;
    }
    void showInfo() {
        System.out.println("택시"+this.num+"번의 승객은 "+ this.people+"명이고, 수입은 "+this.income+"원 입니다.");
    }
}

class Subway extends PublicTransfer{
    protected String nosun;

    Subway(){};
    Subway(String nosun){
        this.nosun = nosun;
    }
    void showInfo() {
        System.out.println("지하철"+this.nosun+"의 승객은 "+ this.people+"명이고, 수입은 "+this.income+"원 입니다.");
    }
}
