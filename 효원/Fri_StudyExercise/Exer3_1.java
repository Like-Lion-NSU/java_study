package Fri_StudyExercise;
//7-10
//MyTv2클래스의 멤버변수 isPowerOn,channel,volume을 클래스 외부에서
// 접근할 수 없도록 제어자를 붙이고 대신 이 멤버변수들의 값을 어디서나 읽고
// 변경할 수 있도록 getter와 setter 메서드를 추가하라
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
        this.channel = channel;}//입력받은 channel 값을 현재채널에 저장
//        if (channel>MIN_CHANNEL && channel<MAX_CHANNEL ){//채널의 최소값보다 크고 최대값보다 작을 때
//        this.channel = channel;}//channel을 입력받음
//        else {//아닐 경우
//            System.out.println("[CH]최소값을 넘거나 최대값을 넘었습니다.");}//메세지 출력

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

public class Exer3_1 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);//채널값을 10으로 설정
        System.out.println("CH:"+t.getChannel());
        t.setVolume(10);
        System.out.println("VOL:"+t.getVolume());
    }
}
//setter: 특정 클래스 멤버변수 값을 변경
//getter: 특정 클래스 멤버변수 값을 조회