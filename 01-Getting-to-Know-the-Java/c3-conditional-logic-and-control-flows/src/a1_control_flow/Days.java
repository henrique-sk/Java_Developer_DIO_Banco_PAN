package a1_control_flow;

import java.util.Scanner;

public class Days {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Which day of the week? ");
    String weekDay = scanner.next().toLowerCase();

    int dayNumber = 0;
    switch (weekDay) {
      case "monday":
        dayNumber = 1;
        break;
      case "tuesday":
        dayNumber = 2;
        break;
      case "wednesday":
        dayNumber = 3;
        break;
      case "thursday":
        dayNumber = 4;
        break;
      case "friday":
        dayNumber = 5;
        break;
      case "saturday":
        dayNumber = 6;
        break;
      case "sunday":
        dayNumber = 7;
        break;
      default:
        System.out.println("Something went wrong!");
    }
    whichDay(dayNumber);

  }

  public static void whichDay(int day) {
    String result = "";
    if (day != 0) {
      System.out.println("Day " + day + " of the week.");
    }
    switch (day) {
      case 1:
      case 2:
      case 3:
        System.out.println("Right.");
        break;
      case 4:
        System.out.println("Wrong.");
        break;
      case 5:
        System.out.println("Maybe.");
        break;
      default:
    }

  }

}
