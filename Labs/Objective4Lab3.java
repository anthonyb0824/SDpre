
import java.util.Scanner;
import java.util.Date;

public class Objective4Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear;
    Date d = new Date();
    currentYear = d.getYear()+1900;
    birthYear = 0;

    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");
    age = input.nextInt();

    birthYear = currentYear - age;

    System.out.println("You were born in " + birthYear);
    input.close();
  }
}
