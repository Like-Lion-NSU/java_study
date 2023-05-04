package 영태.Week04;

public class Student {
    private String name;
    private String dept;
    private int hakbun;
    private double grade;

    public String getName(){
        return name;
    }

    Student(){}
    Student(String name, String dept, int hakbun, double grade){
        this.name = name;
        this.dept = dept;
        this.hakbun = hakbun;
        this.grade = grade;
    }

    void Student_print(){
        System.out.println("이름:" + name);
        System.out.println("학과:" + dept);
        System.out.println("학번:" + hakbun);
        System.out.println("학점평균:" + grade);
    }

}
