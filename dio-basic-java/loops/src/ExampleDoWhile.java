import java.util.Random;

public class ExampleDoWhile {
  public static void main(String[] args) {
    System.out.println("Dialing...");

    do {
      // Running until you answer the phone
      System.out.println("Phone Ringing!");

    } while (ringing());

    System.out.println("Hello");
  }

  private static boolean ringing() {
    boolean answered = new Random().nextInt(3) == 1;
    System.out.println("Did you answer? " + answered);
    // negando o ato de continuar tocando
    return !answered;
  }
}