package a1_repetition_structures;

import java.util.Scanner;

/*
Make a program that asks for a score, between zero and ten.
Show a message if the value is invalid and keep asking until the user enters a valid value.
*/

public class Ex2_Score {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the score between 0 and 10: ");
    int score = scanner.nextInt();

    while (score < 0 || score > 10) {
      System.out.println("Invalid value. Please enter a score between 0 and 10: ");
      score = scanner.nextInt();
    }
  }

}
