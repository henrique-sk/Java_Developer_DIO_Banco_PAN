package a1_repetition_structures;

import java.util.Scanner;

/*
Make a program that reads sets of two values,
the first representing the student's name and the second representing his age.
(Stop the program by entering the value 0 in the name field)
*/

public class Ex1_NameAndAge {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    String name;
    int age;

    while(true) {
      System.out.println("Type the name of the student: (or type '0' to stop)");
      name = scanner.next();
      if (name.equals("0")) break;
      System.out.println("Type the age of the student: ");
      age = scanner.nextInt();
    }

    System.out.println("Program Closed.");
  }
}