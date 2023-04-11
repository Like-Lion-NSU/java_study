class MyTv2 {
    private boolean isPowerOn; // 전원
    private int channel; // 채널 변수
    private int volume; // 볼륨 변수
    private int PrevChannel; // 이전채널


    final int MAX_VOLUME = 100; //최대 볼륨을 상수 100으로 초기화
    final int MIN_VOLUME = 0; // 최저 볼륨을 상수 0으로 초기화
    final int MAX_CHANNEL = 100; // 최대 채널을 상수 100으로 초기화
    final int MIN_CHANNEL = 1; // 최저 채널을 상수 1로 초기화


    public void setPowerOn(){isPowerOn =! isPowerOn;} // 전원버튼
    public void setChannel(int channel){ // 채널 설정
        if(MAX_CHANNEL<channel || MIN_CHANNEL>channel) //최대채널이 현재 채널을 넘지 않게,최저 채널이 현재 채널보다 낮아지지 않게 if 문 설정
            return; // 값 리턴
        PrevChannel=this.channel; // 현재 채널을 이전 채널에 저장
        this.channel=channel; //객체 자신을 가르킴


    }
    public int getChannel(){ //getter
        return channel;
    }
    public void setVolume(int volume) { // 볼륨 메서드 setter
        this.volume=volume;
    }
    public int getVolume() { // getter
       return volume;

    }
    public void togoPrevChannel() { // 이전채널로 되돌리는 메서드
        setChannel(PrevChannel);

    }

}

class Exercise7{
    public static void main(String[] args) {
        MyTv2 t =new MyTv2();

        t.setChannel(10);
        System.out.println("CH: " + t.getChannel());
        t.setChannel(20);
        System.out.println("CH: " + t.getChannel());
        t.togoPrevChannel();
        System.out.println("CH:"+t.getChannel());
        t.togoPrevChannel();
        System.out.println("CH:"+t.getChannel());


    }
}

//class MyTv2 {
//    boolean isPowerOn;
//    int channel;
//    int volume;
//
//    private final int MAX_VOLUME = 100;
//    private final int MIN_VOLUME = 0;
//    private final int MAX_CHANNEL = 100;
//    private final int MIN_CHANNEL = 1;
//
//
//    public void setPowerOn(){isPowerOn =! isPowerOn;}
//    public void setChannel(int channel){
//        this.channel=channel;
//    }
//    public int getChannel(){
//        return channel;
//    }
//    public void setVolume(int volume){
//        this.volume=volume;
//    }
//    public int getVolume(){
//       return volume;
//    }
//
//
//}
//
//class Exercise7{
//    public static void main(String[] args) {
//        MyTv2 t =new MyTv2();
//
//        t.setChannel(10);
//        System.out.println("CH: " + t.getChannel());
//        t.setVolume(20);
//        System.out.println("VOL: " + t.getVolume());
//
//    }
//}
