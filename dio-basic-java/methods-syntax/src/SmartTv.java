public class SmartTv {
  private boolean isOn;
  private int channel;
  private int volume;

  public smartTv() {
    this.isOn = false;
    this.channel = 1;
    this.volume = 10;
  }

  public boolean isOn() {
    return isOn;
  }

  public int getChannel() {
    return channel;
  }

  public int getVolume() {
    return volume;
  }

  public void turnOn() {
    isOn = true;
    System.out.println("The TV is now ON.");
  }

  public void turnOff() {
    isOn = false;
    System.out.println("The TV is now OFF.");
  }

  public void increaseVolume() {
    if (isOn) {
      volume++;
      System.out.println("Volume increased to: " + volume);
    } else {
      System.out.println("The TV is OFF. Cannot adjust the volume.");
    }
  }

  public void decreaseVolume() {
    if (isOn) {
      volume--;
      System.out.println("Volume decreased to: " + volume);
    } else {
      System.out.println("The TV is OFF. Cannot adjust the volume.");
    }
  }

  public void increaseChannel() {
    if (isOn) {
      channel++;
      System.out.println("Channel increased to: " + channel);
    } else {
      System.out.println("The TV is OFF. Cannot change the channel");
    }
  }

  public void decreaseChannel() {
    if (isOn) {
      channel--;
      System.out.println("Channel decreased to: " + channel);
    } else {
      System.out.println("The TV is OFF. Cannot change the channel.");
    }
  }

  public void changeChannel(int newChannel) {
    if (isOn) {
      channel = newChannel;
      System.out.println("Channel changed to: " + channel);
    } else {
      System.out.println("The TV is OFF. Cannot change the channel.");
    }
  }

  public static void main(String[] args) {
    smartTv tv = new SmartTv();

    tv.turnOn();
    tv.increaseVolume();
    tv.decreaseVolume();
    tv.increaseChannel();
    tv.decreaseChannel();
    tv.changeChannel(5);
    tv.turnOff();

  }
}
