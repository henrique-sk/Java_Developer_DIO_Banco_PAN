package a1_arrays;

/*
Create an array of 6 integers
and display them in reverse order.
*/

public class Ex1_ReverseOrder {

  public static void main(String[] args) {
    int[] numbers = { -78, 389, -1, 48, 50, 2674 };

    System.out.print("Reverse Array: ");
    for (int i = numbers.length; i > 0; i--) {
      System.out.print(numbers[i - 1] + " ");
    }
  }

}
