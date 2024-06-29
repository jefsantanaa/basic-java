public class ArrayForExample {
  public static void main(String[] args) {
    String students[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

    for (int x = 0; x < students.length; x++) {
      System.out.println("The student at index x: " + x + " is " + students[x]);
    }

    // Shortest form
    for (String student : students) {
      System.out.println(student);
    }
  }
}
