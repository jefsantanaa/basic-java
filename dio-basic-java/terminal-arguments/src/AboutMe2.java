import java.util.Locale;
import java.util.Scanner;

public class AboutMe2 {
  public static void main(String[] args) {
    // Creating the scanner object.
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Type your name");
    String name = scanner.next();

    System.out.println("Type your surname");
    String surname = scanner.next();

    System.out.println("Typer your age");
    int age = scanner.nextInt();

    System.out.println("Type your height");
    double height = scanner.nextDouble();

    // Showing the user the information.
    System.out.println("Hi, I'm " + name + " " + surname);
    System.out.println("I'm " + age + " years old");
    System.out.println("My height " + height + "cm");

  }
}
