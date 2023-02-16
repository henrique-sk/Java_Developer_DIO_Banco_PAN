package a1_java_anatomy_classes;

public class MyClass {
  public static void main(String[] args) {

    String firstName = "Henrique";
    String secondName = "Schilling";

    String completeName = completeName(firstName, secondName);
    System.out.println(completeName);

  }

  public static String completeName(String firstName, String secondName) {
    return "Method result is: " + firstName.concat(" ").concat(secondName);

  }
}
