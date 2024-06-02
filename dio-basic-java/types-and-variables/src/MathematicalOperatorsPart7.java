public class MathematicalOperatorsPart7 {
  public static void main(String[] args) {
    int a = 5;
    System.out.println(a > 3 && a < 10); // Returns true because 5 is greater than 3 AND 5 is less than 10.
    int b = 5;
    System.out.println(b > 3 || b < 4); // Returns true because one of the conditions are true (5 is greater than 3, but 5 is not less than 4).
    int c = 5;
    System.out.println(!(c > 3 && c < 10)); // Returns false because ! (not) is used to reverse the result.
  }
}
