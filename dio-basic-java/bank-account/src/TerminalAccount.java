import java.util.Locale;
import java.util.Scanner;

public class TerminalAccount {
  public static void main(String[] args) throws Exception {
    // Creating the scanner object.
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
    System.out.println("Please, type your Number Agency:");
    int number = scanner.nextInt();

    System.out.println("Please, type your Agency:");
    String agency = scanner.next();

    System.out.println("Please, type your Owner Name:");
    String ownerName = scanner.next();

    System.out.println("Please, type your balance:");
    double balance = scanner.nextDouble();

    // Showing owner account information
    System.out.println("Hello " + ownerName + ", thank you for creating an account with our bank, your Agency is: " + agency + ", Account Number: " + number + ", and your Balance: " + balance + " is now available for withdrawal.");
  }

}
