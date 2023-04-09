package 영태.Week03;

class MyTv2{
    private boolean isPowerOn;      // 외부 접근 X
    private int channel;      // 외부 접근 X
    private int volume;      // 외부 접근 X

    final int MAX_vOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public void setIsPowerOn(boolean isPowerOn){        // setter
        this.isPowerOn = isPowerOn;
    }

    public void setChannel(int channel){        // setter
        this.channel = channel;
    }

    public void setVolume(int volume){        // setter
        this.volume = volume;
    }

    public boolean getIsPowerOn(){      // getter
        return isPowerOn;
    }

    public int getChannel(){      // getter
        return channel;
    }

    public int getVolume(){      // getter
        return volume;
    }

}

public class Exercies7_10 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());
        t.setVolume(20);
        System.out.println("VOL:"+t.getVolume());
    }

}
