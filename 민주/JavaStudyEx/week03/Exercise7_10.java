package week03;

public class Exercise7_10 {
public static void main(String args[]){
    MyTv2 t = new MyTv2();

    t.setChannel (10);
    System.out.println("Ch : "+t.getChannel());
    t.setVolume(20);
    System.out.println("Vol : "+t.getVolume());
}

}
class MyTv2{
    boolean isPowerOn;
    int channel;
    int volume;
    final int MAX_VOlUME = 100;
    final int MIN_VOlUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public void setChannel(int channel){
        this.channel=channel;
    }
    public int getChannel(){
        return channel;
    }
    public void setVolume(int volume){
        this.volume=volume;
    }
    public int getVolume(){
        return volume;
    }

}
