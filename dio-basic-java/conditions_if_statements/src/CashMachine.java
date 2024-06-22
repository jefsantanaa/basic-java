public class CashMachine {
  public static void main(String[] args) {

    double balance = 25.0;
    double amountRequested = 17.0;

    if (amountRequested < balance) {
      balance = balance - amountRequested;

      System.out.println(balance);
    }
  }
}
