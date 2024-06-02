import java.util.Scanner;

public class MathematicalOperatorsPart3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Unary Operators are the types that need only one operand to perform any
        // operation like increment, decrement, negation, etc. It consists of various
        // arithmetic, logical and other operators that operate on a single operand.

        int num = 10;

        int result = +num;
        System.out.println(
                "The value of result after unary plus is: "
                        + result);

        result = -num;
        System.out.println(
                "The value of result after unary minus is: "
                        + result);

        result = ++num;
        System.out.println(
                "The value of result after pre-increment is: "
                        + result);

        result = num++;
        System.out.println(
                "The value of result after post-increment is: "
                        + result);

        result = --num;
        System.out.println(
                "The value of result after pre-decrement is: "
                        + result);

        result = num--;
        System.out.println(
                "The value of result after post-decrement is: "
                        + result);

        int number = 5; // Number 5 is positive.

        number = - number; // Changing to negative.
        System.out.println(number);

        number = + number; // This way doesn't change to positive.
        System.out.println(number);

        number = number * -1; // We need to use multiplication to turn negative number to positive number.
        System.out.println(number);
    }
}