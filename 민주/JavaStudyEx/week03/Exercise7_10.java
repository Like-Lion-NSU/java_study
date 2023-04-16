package week03;

public class Exercise7_10 {
public static void main(String args[]){ // main class
    MyTv2 t = new MyTv2(); // 객체 생성

    t.setChannel (10); // 숫자 삽입
    System.out.println("Ch : "+t.getChannel()); // 화면 출력
    t.setVolume(20); // 숫자 삽입
    System.out.println("Vol : "+t.getVolume()); // 화면출력
}

}
class MyTv2{
    private boolean isPowerOn; // 사용할 변수 선언
    private int channel;
    private int volume;
    final int MAX_VOlUME = 100; // final값 지정 : 변하지 않음
    final int MIN_VOlUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public void setChannel(int channel){ // 메소드 생성
        this.channel=channel; // this.channel은 메소드 내의 변수, channel은 main에서 가져온 값
    }
    public int getChannel(){ // 메소드 생성
        return channel; // channel값 return
    }
    public void setVolume(int volume){ // 메소드 생성
        this.volume=volume; // this.volume은 메소드 내의 변수, volume은 main에서 가져온 값
    }
    public int getVolume(){ // 메소드 생성
        return volume; // volume값 return
    }
}