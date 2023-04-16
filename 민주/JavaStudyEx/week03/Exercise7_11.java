/*package week03;
class MyTv2{
   private boolean isPowerOn;
   private int channel;
   private int pre;
   private int volume;
   final int MAX_VOlUME = 100;
   final int MIN_VOlUME = 0;
   final int MAX_CHANNEL = 100;
   final int MIN_CHANNEL = 1;//7-10에 있는 것 가져옴

   public void setChannel(int channel){ // OR 연산자 둘 다 f ->f
      if (channel>MAX_CHANNEL||channel<MIN_CHANNEL)
         return;
      pre=this.channel;//pre에 this.channel의 값을 입력
      this.channel=channel;
   }
   public int getChannel(){
      return channel;
   }
   public void gotoPrevChannel(){
      setChannel(pre);}
}
public class Exercise7_11 {
     public static void main (String args[]){
        MyTv2 t = new MyTv2 () ;
        t. setChannel (10);
        System.out.println ("CH: "+t. getChannel ());
        t. setChannel (20);
        System.out.println ("CH: "+t. getChannel () );
        t. gotoPrevChannel ();
        System.out.println ("CH: "+t. getChannel ());
        t.gotoPrevChannel ();
        System. out. println ("CH: "+t. getChannel ());
     }
}*/