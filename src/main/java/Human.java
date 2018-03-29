package csci305.javalab;
import java.util.*;

public class Human extends Player {

  private Map<Integer, Element> moves;
  private Scanner s = new Scanner(System.in);

  public Human(String name) {
    super(name);
  }

  public String getName() {
    return super.getName();
  }

  public void setMoves(Map<Integer, Element> moves) {
    this.moves = moves;
  }

  public Element getPrevMove() {
    return super.getPrevMove();
  }

  public void setPrevMove(Element e) {
    super.setPrevMove(e);
  }

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

    while (n > 5) {
      System.out.println("Invalid move. Please try again");
      System.out.print("Enter your move: ");
      n = s.nextInt();
    }

    Element e = moves.get(n);

    return e;
  }
}
