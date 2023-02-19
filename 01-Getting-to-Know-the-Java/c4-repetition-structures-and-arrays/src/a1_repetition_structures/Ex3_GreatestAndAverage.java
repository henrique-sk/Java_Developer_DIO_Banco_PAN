package a1_repetition_structures;

import java.util.Scanner;

/*
Make a program that reads 5 numbers
and tells it the largest number
and the average of these numbers.
*/

public class Ex3_GreatestAndAverage {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("You are going to type 5 numbers.");

    int number;
    int counter = 0;
    int largest = 0;
    int sum = 0;
    do {
      System.out.println("Enter the number " + counter + ": ");
      number = scanner.nextInt();
      if (number > largest) {
        largest = number;
      }
      sum = sum + number;
      counter++;
    } while (counter < 5);

    System.out.println("The largest number is " + largest
        + "\nand the average is " + (sum / 5) + ".");
  }
}