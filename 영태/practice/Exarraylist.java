package 영태.practice;

import java.util.*;

class MyTv2 {
    private boolean isPowerOn;//같은 클래스에서만 접근 가능한 private
    private int channel;
    private int volume;
    int prechannel;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    /*(1)*/
    public void setChannel(int channel) {//어디에서나 읽고 변경가능 public 사용

        prechannel = this.channel;//이전채널값을 저장
        this.channel = channel;
        if (channel>MIN_CHANNEL && channel<MAX_CHANNEL ){//채널의 최소값보다 크고 최대값보다 작을 때
            this.channel = channel;}//channel을 입력받음
        else {//아닐 경우
            System.out.println("[CH]최소값을 넘거나 최대값을 넘었습니다.");}//메세지 출력
    }//입력받은 channel 값을 현재채널에 저장


    public int getChannel() {//입력 X, 출력 O
        return channel;//채널 값 반환
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
//        if (volume<MIN_VOLUME && volume>MAX_VOLUME){
//            return volume;}
//        else {
//            System.out.println("최소값을 넘거나 최대값을 넘었습니다");}
    }

    //메서드
    public void gotoPrevChannel() {
        setChannel(prechannel);//현재채널(channel) -> 이전 채널(prechannel)로 변경
    }
}

public class Exarraylist {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);//채널값을 10으로 설정
        System.out.println("CH:"+t.getChannel());
        t.setVolume(10);
        System.out.println("VOL:"+t.getVolume());
    }
}
