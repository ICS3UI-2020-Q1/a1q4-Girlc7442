import java.util.Scanner;

/**
 *Calculates the slope of a line
 * @author Cole Girling
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner for user input
    Scanner input = new Scanner(System.in);

    //asks the user for the first x coordinate
    System.out.println("Please enter the first x coordinate");
    //initializes the first x coordinate
    int xOne = input.nextInt();

    //asks the user for the first y coordinate
    System.out.println("Please enter the first y coordinate");
    //initializes the first y coordinate
    int yOne = input.nextInt();

    //asks the user for the second x coordinate
    System.out.println("Please enter the second x coordinate");
    //initializes the second x coordinate
    int xTwo = input.nextInt();

    //asks the user for the second y coordinate
    System.out.println("Please enter the second y coordinate");
    //initializes the second y coordinate
    int yTwo = input.nextInt();

    //Calculates the slope of the line
    final double formula = (yTwo - yOne) / (xTwo - xOne);

    //Prints the slope to the screen
    System.out.println(formula);
    
  }
}
