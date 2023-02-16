package a4_smart_tv_system;

public class SmartTv {
  boolean on = false;
  int channel = 1;
  int volume = 25;
  String separator = "\n-------------------------";

  public void turnOn() {
    on = true;
    System.out.println("Turned on the tv" + this.separator);
  }

  public void turnOff() {
    on = false;
    System.out.println("Turned off the tv" + this.separator);
  }

  public void increaseChannel() {
    channel++;
    System.out.println("Increased the channel to: "
                       + this.channel + this.separator);
  }

  public void decreaseChannel() {
    channel--;
    System.out.println("Decreased the channel to: "
                       + this.channel + this.separator);
  }

  public void changeChannel(int channel) {
    this.channel = channel;
    System.out.println("Changed the channel to: "
                       + this.channel + this.separator);
  }

  public void increaseVolume() {
    volume++;
    System.out.println("Increased the volume to: "
                       + this.volume + this.separator);
  }

  public void decreaseVolume() {
    volume--;
    System.out.println("Decreased the volume to: "
                       + this.volume + this.separator);
  }

  @Override
  public String toString() {
    return "Is the TV on? " + this.on
    + "\nCurrent channel: " + this.channel
    + "\nCurrent volume: " + this.volume
    + this.separator;
  }

}
