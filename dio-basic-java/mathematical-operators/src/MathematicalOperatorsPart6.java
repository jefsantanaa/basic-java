public class MathematicalOperatorsPart6 {
  public static void main(String[] args) {
    int number1 = 1;
    int number2 = 2;
    boolean decision = number1 == number2;

    if (number1 > number2) {
      System.out.println("Is number 1 greater than number 2? " + decision);
    }

    if (number1 < number2) {
      System.out.println("Is number 1 smaller than number 2? " + decision);
    }

    if (number1 == number2) {
      System.out.println("Is number 1 the same as the number 2? " + decision);
    }

    if (number1 != number2) {
      System.out.println("Is number 1 different from number 2? " + decision);
    }

    if (number1 <= number2) {
      System.out.println("Is number 1 smaller equal than the number 2? " + decision);
    }

    if (number1 >= number2) {
      System.out.println("Is number 1 greater equal than the number 2? " + decision);
    }
  }
}
