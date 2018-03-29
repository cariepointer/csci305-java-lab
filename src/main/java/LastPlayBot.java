package csci305.javalab;
import java.util.*;

public class LastPlayBot extends Player {

  private Map<Integer, Element> moves;
  private boolean firstMove = true;
  private Player opponent;

  public LastPlayBot(String name) {
    super(name);
  }

  public String getName() {
    return super.getName();
  }

  public void setMoves(Map<Integer, Element> moves) {
    this.moves = moves;
  }

  public void setOpponent(Player opponent) {
    this.opponent = opponent;
  }

  @Override
  public Element play() {
    Element e;

    if (firstMove) {
      Random rand = new Random();
      int n = rand.nextInt(moves.size())+1;
      e = moves.get(n);
      firstMove = false;
    }
    else {
      e = opponent.getPrevMove();
    }
    return e;
  }
}
