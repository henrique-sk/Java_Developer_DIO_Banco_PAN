package a5_terminal_and_arguments;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe2 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Enter your first name: ");
    String firstName = scanner.next();

    System.out.println("Enter your second name: ");
    String secondName = scanner.next();

    System.out.println("Enter your age: ");
    int age = scanner.nextInt();

    System.out.println("Enter your heith (in meters): ");
    double height = scanner.nextDouble();

    System.out.println("Hello, My name is " + firstName + " " + secondName + ".");
    System.out.println("I'm " + age + " years old.");
    System.out.println("And I'm " + height + " meters height.");
  }
}
