package a1_repetition_structures;

import java.util.Scanner;

/*
Make a program that calculates the factorial of a user-supplied integer.
E.g.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

public class Ex6_Factorial {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("What number do you want to know the factorial of? ");
    int factorial = scanner.nextInt();

    int result = 1;
    for (int i = factorial; i > 1; i--) {
      result = result * i;
    }
    System.out.println("The factorial is " + result);

  }
}
