package a3_operators;

public class Operators {
  public static void main(String[] args) {
    String separator = "------------------";

    String concatenation = "?";

    concatenation = 1 + 1 + 1 + "1";
    System.out.println(concatenation);

    concatenation = 1 + "1" + 1 + 1;
    System.out.println(concatenation);

    concatenation = 1 + "1" + 1 + "1";
    System.out.println(concatenation);

    concatenation = "1" + 1 + 1 + 1;
    System.out.println(concatenation);

    concatenation = "1" + (1 + 1 + 1);
    System.out.println(concatenation);

    System.out.println(separator);

    int number = 5;

    number = -number;

    System.out.println(number);

    number = -number; // or number = number * - 1

    System.out.println(number);

    System.out.println(separator);

    int a, b;
    a = 5;
    b = 6;
    String result = a > b ? "true" : "false";
    System.out.println(result);
  }
}
