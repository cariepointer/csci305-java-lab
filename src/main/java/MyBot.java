package csci305.javalab;
import java.util.*;

/**
* Class MyBot only plays Rock, Paper, or Scissors.
* MyBot is (dumb and) unaware of the moves Spock and Lizard, so instead
* it randomly picks between the three classical moves.
*/
public class MyBot extends Player {
  private Random rand;
  public MyBot(String name) {
    super(name);
  }

  public String getName() {
    return super.getName();
  }

  public void setMoves(Map<Integer, Element> moves) {
    super.setMoves(moves); // Add moves to super class
    rand = new Random();
  }

  public Map<Integer, Element> getMoves() {
    return super.getMoves(); // Get moves from super class
  }

  @Override
  public Element play() {
    int n = rand.nextInt(3)+1; // Generate random number of 1, 2, or 3
    Element e = getMoves().get(n); 
    return e;
  }

}
