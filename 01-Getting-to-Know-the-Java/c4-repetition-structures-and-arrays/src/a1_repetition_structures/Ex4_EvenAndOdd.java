package a1_repetition_structures;

import java.util.Scanner;

/*
Make a program that asks for N integers,
calculate and display the number of even numbers
and the number of odd numbers.
*/

public class Ex4_EvenAndOdd {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter a number: ");
    int number = scanner.nextInt();

    int even = 0, odd = 0;
    String answer = "Y";
    while(true) {
      if (number % 2 == 0) {
        even++;
      } else {
        odd++;
      }

      System.out.println("want to enter one more number? (Y/N): ");
      answer = scanner.next().toUpperCase();

      if (answer.equals("N")) break;
      
      System.out.println("Enter the next number: ");
      number = scanner.nextInt();
    }

    System.out.println("The total of even numbers is: " + even);
    System.out.println("The total of odd numbers is: " + odd);    
  }

}
