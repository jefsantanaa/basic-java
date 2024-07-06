import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMeTest {
    public static void main(String[] args) throws Exception {
        // Creating the scanner object
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Enter your first name: ");
            String firstName = scanner.next();

            System.out.println("Enter your last name: ");
            String lastName = scanner.next();

            System.out.println("Enter your age: ");
            int age = scanner.nextInt();

            System.out.println("Enter your height: ");
            double height = scanner.nextDouble();

            // Priting user data
            System.out.println("Hello, my first name is "+ firstName.toUpperCase() + " " + lastName.toUpperCase());
            System.out.println("I am " + age + " years old");
            System.out.println("My height is " + height + " cm");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter the correct values.");
        } catch (Exception e) {
            System.out.println("An unexpected error ocurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}