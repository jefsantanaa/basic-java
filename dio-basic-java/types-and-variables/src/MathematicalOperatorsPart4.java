public class MathematicalOperatorsPart4 {
  public static void main(String[] args) {
    int number = 5;
    // In programming Java, the increment operator ++ increases the value of a
    // variable by 1. Similarly, the decrement operator -- decreases the value of a
    // variable by 1.
    ++number; // a becomes 6
    number++; // a becomes 7
    --number; // a becomes 6
    number--; // a becomes 5

    boolean variable =  true;
    System.out.println(!variable); // Force the exchange.
    System.out.println(variable); // It is necessary to assign another value to the variable to change the value.

    // To assign another value we can use this: variable = !variable;
  }
}
