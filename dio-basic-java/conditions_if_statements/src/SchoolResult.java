public class SchoolResult {
  public static void main(String[] args) {

    int grade = 6;

    if (grade >= 7) {
      System.out.println("Approved");
    } else if (grade >= 5 && grade < 7) {
      System.out.println("Retake test");
    } else {
      System.out.println("Disapproved");
    }

  }
}
