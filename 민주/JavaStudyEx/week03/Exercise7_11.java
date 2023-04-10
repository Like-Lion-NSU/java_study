package week03;
class MyTv2{
   boolean isPowerOn;
   int channel;
   int pre;
   int volume;
   final int MAX_VOlUME = 100;
   final int MIN_VOlUME = 0;
   final int MAX_CHANNEL = 100;
   final int MIN_CHANNEL = 1;

   public void setChannel(int channel){
      if (channel>MAX_CHANNEL||channel<MIN_CHANNEL)
         return;
      pre=this.channel;
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
}