package a2_arrays;

import java.util.Scanner;

/*
Make a Program that reads an array of 6 characters,
and tell how many consonants were read.
Print the consonants.
*/

public class Ex2_Consonants {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] consonants = new String[6];
    int totalConsonants = 0;

    int count = 0;
    do {
      System.out.println("Enter a letter: ");
      String letter = scanner.next();

      if (!(letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("i")
          || letter.equalsIgnoreCase("o") || letter.equalsIgnoreCase("u"))) {
        consonants[count] = letter;
        totalConsonants++;
      }
      count++;
    } while (count < consonants.length);

    System.out.print("Consonants: ");
    for (String consonant : consonants) {
      if (consonant != null) {
        System.out.print(consonant + " ");
      }
    }
    System.out.print("\nTotal of consonants: " + totalConsonants);

  }

}
