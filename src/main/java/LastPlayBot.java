package csci305.javalab;
import java.util.*;

/**
* Class LastPlayBot will always play the move that the opponent played on the previous move
*/
public class LastPlayBot extends Player {

  private boolean firstMove = true;

  public LastPlayBot(String name) {
    super(name);
  }

  public String getName() {
    return super.getName();
  }

  public void setMoves(Map<Integer, Element> moves) {
    super.setMoves(moves); // Add moves to superclass
  }

  public Map<Integer, Element> getMoves() {
    return super.getMoves(); // Get moves from super class
  }

  // Set opponent's previous move; This method is called in Main() if the Player's bot is LastPlayBot
  public void setOppPrevMove(Element e) {
    super.setOppPrevMove(e);
  }

  //Returns opponent's previous move. Called in play() method
  public Element getOppPrevMove() {
    return super.getOppPrevMove();
  }

  @Override
  public Element play() {
    Element e;

    if (firstMove) { // If this is the first move, randomly pick a move to play
      Random rand = new Random();
      int n = rand.nextInt(getMoves().size())+1;
      e = getMoves().get(n);
      firstMove = false;
    }
    else { //Get opponent's previous move and play it
      e = getOppPrevMove();
    }
    return e;
  }
}
