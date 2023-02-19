package a1_arrays;

import java.util.Random;

/*
Make a program that reads 20 random integers (between 0 and 100) and stores them in an array.
At the end show the numbers and their successors.
*/

public class Ex3_RandomNumbers {

  public static void main(String[] args) {
    Random random = new Random();
    int[] randomNumbers = new int[20];

    for (int i = 0; i < randomNumbers.length; i++) {
      randomNumbers[i] = random.nextInt(101);
    }

    System.out.print("The numbers are: ");
    for (int randomNumber : randomNumbers) {
      System.out.print(randomNumber + " ");
    }

    System.out.print("\nThe successors are: ");
    for (int randomNumber : randomNumbers) {
      System.out.print((randomNumber + 1) + " ");
    }
  }

}
