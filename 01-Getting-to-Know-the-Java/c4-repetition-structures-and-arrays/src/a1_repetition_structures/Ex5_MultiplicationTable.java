package a1_repetition_structures;

import java.util.Scanner;

/*
Develop a multiplication table generator
able to generate the multiplication table of any integer between 1 and 10.
The user must inform which number he wants to see the multiplication table.
The output must be like the example below:
Table of 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

public class Ex5_MultiplicationTable {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Do you want to see the multiplication table of which number? ");
    int number = scanner.nextInt();
    System.out.println("The multiplication table of " + number + ":");

    for (int i = 1; i <= 10; i++) {
      System.out.println(number + " X " + i + " = " + (number * i));
    }
  }
}
