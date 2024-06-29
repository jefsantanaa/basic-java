import java.util.concurrent.ThreadLocalRandom;

public class ExampleWhile {
  public static void main(String[] args) {
    double allowance = 50.0;
    while (allowance > 0) {
      Double sweetValue = randomValue();
      if (sweetValue > allowance)
        sweetValue = allowance;

      System.out.println("Value of sweet: " + sweetValue + " Add to cart");
      allowance = allowance - sweetValue;
    }
    System.out.println("Allowance: " + allowance);
    System.out.println("João spent all his allowance!");
  }

  private static double randomValue() {
    return ThreadLocalRandom.current().nextDouble(2, 8);
  }
}
