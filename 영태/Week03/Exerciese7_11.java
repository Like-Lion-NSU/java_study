package 영태.Week03;

class MyTv22{
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevchannel;
    private int tmp;

    final int MAX_vOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public void setIsPowerOn(boolean isPowerOn){
        this.isPowerOn = isPowerOn;
    }

    public void setChannel(int channel){
        prevchannel = this.channel;     // 이전 채널 저장
        this.channel = channel;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public boolean getIsPowerOn(){
        return isPowerOn;
    }

    public int getChannel(){
        return channel;
    }

    public int getVolume(){
        return volume;
    }

    public void gotoPrevChannel(){      // tmp(빈 멤버함수)를 이용한 값 이동
        tmp = this.channel;
        this.channel = this.prevchannel;
        this.prevchannel = tmp;
    }

}


public class Exerciese7_11 {
    public static void main(String[] args) {
        MyTv22 t = new MyTv22();

        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());
        t.setChannel(20);;
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
    }
}
