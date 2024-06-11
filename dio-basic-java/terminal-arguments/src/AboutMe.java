public class AboutMe {
  public static void main(String[] args) {
    // Arguments start with index 0
    String name = args[0];
    String surname = args[1];
    int age = Integer.valueOf(args[2]); // We'll talk about this latter (Wrappers)
    double height = Double.valueOf(args[3]);

    System.out.println("Hi, I'm " + name + " " + surname);
    System.out.println("I'm " + age + " years old");
    System.out.println("My height is " + height + "cm");
  }
}
