package csci305.javalab;
import java.util.*;

/**
* Class Human takes user input for picking a move
*/
public class Human extends Player {

  private Scanner s = new Scanner(System.in); // New scanner for user input

  public Human(String name) {
    super(name);
  }

  public String getName() {
    return super.getName();
  }

  public void setMoves(Map<Integer, Element> moves) {
    super.setMoves(moves); // Add moves to super class
  }

  public Map<Integer, Element> getMoves() {
    return super.getMoves(); // Get moves from super class
  }

  // Prints menu for possible moves
  @Override
  public Element play() {
    System.out.println("Move choices:");
    System.out.println("(1) : Rock");
    System.out.println("(2) : Paper");
    System.out.println("(3) : Scissors");
    System.out.println("(4) : Spock");
    System.out.println("(5) : Lizard");
    System.out.print("Enter your move: ");
    int n = s.nextInt();

    // Print error if user enters invalid choice
    while (n > 5 || n < 1) {
      System.out.println("Invalid move. Please try again");
      System.out.print("Enter your move: ");
      n = s.nextInt();
    }

    Element e = getMoves().get(n);

    return e;
  }
}
