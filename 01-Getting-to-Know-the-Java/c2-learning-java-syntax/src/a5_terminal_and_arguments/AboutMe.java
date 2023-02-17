package a5_terminal_and_arguments;

public class AboutMe {
  public static void main(String[] args) {
    
    // dados no launch.json
    String firstName = args [0];
    String secondName = args [1];
    int age = Integer.valueOf(args [2]);
    double height = Double.valueOf(args [3]);

    System.out.println("Hello, My name is " + firstName + " " + secondName + ".");
    System.out.println("I'm " + age + " years old.");
    System.out.println("And I'm " + height + " meters height.");
    
  }
}
