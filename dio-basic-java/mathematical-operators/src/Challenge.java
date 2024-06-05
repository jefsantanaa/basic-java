import java.util.Scanner;

public class Challenge {
  public static void main(String[] args) {
    // Read the input values.
    Scanner inputReader = new Scanner(System.in);
    float salaryValue = inputReader.nextFloat();
    float benefitValue =  inputReader.nextFloat();
    
    float taxAmount = 0;
    if (salaryValue >= 0 && salaryValue <= 1100) {
      taxAmount = 0.05F * salaryValue;
    } else if (salaryValue >= 1100.01 && salaryValue <= 2500.00) {
      taxAmount = 0.10F * salaryValue;
    } else (salaryValue > 2500.00) {
      taxAmount = 0.15F * salaryValue;
    }

    float output = salaryValue - taxAmount + benefitValue;
    System.out.println(String.format("%.2f", output));
}
}
