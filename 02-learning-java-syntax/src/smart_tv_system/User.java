package smart_tv_system;

public class User {
  public static void main(String[] args) {
    
    SmartTv smartTv = new SmartTv();


    System.out.println(smartTv);

    smartTv.turnOn();

    System.out.println(smartTv);

    smartTv.decreaseVolume();
    smartTv.decreaseVolume();
    smartTv.decreaseVolume();
    smartTv.increaseVolume();

    System.out.println(smartTv);

    smartTv.increaseChannel();
    smartTv.increaseChannel();
    smartTv.decreaseChannel();
    smartTv.changeChannel(15);

    System.out.println(smartTv);
  }
}
