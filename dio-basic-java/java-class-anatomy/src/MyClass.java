public class MyClass {
  public static void main(String [] args) {
    System.out.print ("Hello World!");

    String firstName = "Jefferson";
    String middleName = "Santana";

    String fullName = fullName (firstName, middleName);
    System.out.println(fullName);


  }

  public static String fullName (String firstName, String middleName) {
    return firstName.concat(" ").concat(middleName);
  }

}

/* 
int year = 2021;
year = 2022;
double PI = 3.14;
int ESTADOS_BRASILEIROS = 27;
int ANO_2000 = 2000;
final String BR = "Brazil"; When a variable has a constant value, we declare it in capital letters. 
*/