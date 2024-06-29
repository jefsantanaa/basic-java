public class ExampleBreakContinue {
  public static void main(String[] args) {
    for (int number = 1; number <= 5; number++) {
      if (number == 3)
        break;
        // Break - enters the condition and stops executing for at number 2
      System.out.println(number);

    }

    for (int number = 1; number <= 5; number++) {
      if (number == 3)
        continue;
        // Continue - enters the condition and does not print the number 3 
      System.out.println(number);

    }
  }
}
