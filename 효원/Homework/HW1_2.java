package Homework;

public class HW1_2 {
    public static void main(String[] args) {
        //학생 3명 생성
        Student studentKim = new Student("Kim", 10000);
        Student studentLee = new Student("Lee", 45000);
        Student studentPark = new Student("Park", 5000);

        Bus bus771 = new Bus(771); // 노선 번호 771 버스 생성
        studentKim.takeBus(bus771); // kim이 771 버스 탐
        studentKim.showInfo(); //kim 정보 출력
        bus771.showInfo(); //771버스 정보 출력

        Taxi taxi0406 = new Taxi(0406); // 택시 번호 0406 생성
        studentLee.takeTaxi(taxi0406); // Lee이 0406 택시 탐
        studentLee.showInfo(); //Lee 정보 출력
        taxi0406.showInfo(); //0406택시 정보 출력

        Subway subway1 = new Subway("1호선"); // 1호선 지하철 생성
        studentPark.takeSubway(subway1); // Park이 1호선 지하철 탐
        studentPark.showInfo(); //Park 정보 출력
        subway1.showInfo(); //1호선 정보 출력

    }
}

class Student {
    String studentname;//속성
    int money;

    public Student(String studentname, int money){
        //학생 인스턴스를 생성할 때는 이름과 가진돈을 입력받아야함
        this.studentname = studentname;//기본 생성자면 null로 출력됨
        this.money = money;
    }

    public void takeBus(Bus busnumber) {//버스번호를 입력받음
        money = money - 1500;//버스에 탔을 때 1500원 지불
    }

    public void takeTaxi(Taxi taxinumber) {
        money = money - 4500;
    }
    public void takeSubway(Subway subwayline) {
        money = money - 1500;
    }

    public void showInfo() {//정보 출력
        System.out.printf("%s의 남은 돈은 %d원 입니다.\n", studentname, money);
    }
}

class Transport{
    int busnumber;//노선번호
    int taxinumber;//택시번호
    String subwayline;//지하철 호선
    int passenger;//승객 수
    int income;//수입

}

class Bus extends Transport {//부모클래스(Transport)을 상속
    public Bus(int busnumber) {//버스 인스턴스 생성시 번호 입력받아야함
        this.busnumber = busnumber;//입력받은 번호
        this.passenger = passenger+1;//학생이 버스에 탔을 때 승객이 한명 늘었음
        this.income = income+1500;//Q. 학생이 지불한 1500원 -> 버스 수입
    }
    public void showInfo() {
        System.out.printf("버스 %s번의 승객은 %d명이고, 수입은 %d원입니다.\n", busnumber, passenger, income);
    }
}

class Taxi extends Transport {
    public Taxi(int taxinumber) {
        this.taxinumber = taxinumber;
        this.passenger = passenger+1;
        this.income = income+4500;
    }
    public void showInfo() {
        System.out.printf("택시 %s번의 승객은 %d명이고, 수입은 %d원 입니다.\n", taxinumber, passenger, income);
    }
}

class Subway extends Transport {
    public Subway(String subwayline) {//Q. 지하철 인스턴스 생성시 번호 입력받아야함(Num?)
        this.subwayline = subwayline;
        this.passenger = passenger+1;
        this.income = income+1500;
    }

    public void showInfo() {
        System.out.printf("지하철 %s의 승객은 %d명이고, 수입은 %d원입니다.\n", subwayline, passenger, income);
    }
}