package csci305.javalab;
import java.util.*;
import java.util.Random;

/**
* Class RandomBot will randomly pick and return one of the five possible moves from the moves HashMap
*/
public class RandomBot extends Player {

  private Random rand;

  public RandomBot(String name) {
    super(name);
  }

  public String getName() {
    return super.getName();
  }

  public void setMoves(Map<Integer, Element> moves) {
    super.setMoves(moves); // Add moves to super class
    rand = new Random(); // Create new random instance for play() method
  }

  public Map<Integer, Element> getMoves() {
    return super.getMoves(); // Get moves from super class
  }

  @Override
  public Element play() {

    int n = rand.nextInt(getMoves().size())+1; // Generate random integer from 1-5
    Element e = getMoves().get(n); // Get element based on randomly generated number
    return e;
  }
}
