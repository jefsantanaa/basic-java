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
    }
}