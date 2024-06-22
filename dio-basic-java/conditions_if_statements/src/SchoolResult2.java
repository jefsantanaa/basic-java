public class SchoolResult2 {
  public static void main(String[] args) {
		int grade = 10;
    // String result = grade >=7 ? "Approved" : "Retake test"; Case 1
		String result = grade >=7 ? "Approved" : grade >=5 && grade <7 ? "Retake test" : "Disapproved"; // Case 2
		System.out.println(result);
	}
}
