package a1_control_flow;

import java.util.Scanner;

public class Months {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] months = { "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December" };

    System.out.println("Type the number corresponding to the month you want to check: ");
    int monthNumber = scanner.nextInt();

    String monthName = months[monthNumber - 1];
    if (monthNumber >= 1 && monthNumber <= 12) {
      switch (monthName) {
        case "July":
        case "December":
        case "January":
          System.out.println("it's vacation time!!!");
          break;
        default:
          System.out.println("it's work time.");
      }
      System.out.println(monthNumber + " is the month of " + monthName + ".");
    }
  }

}