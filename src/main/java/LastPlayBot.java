package csci305.javalab;
import java.util.*;

public class LastPlayBot extends Player {

  private boolean firstMove = true;

  public LastPlayBot(String name) {
    super(name);
  }

  public String getName() {
    return super.getName();
  }

  public void setMoves(Map<Integer, Element> moves) {
    super.setMoves(moves);
  }

  public Map<Integer, Element> getMoves() {
    return super.getMoves();
  }

  public void setOpponent(Player opponent) {
    super.setOpponent(opponent);
  }

  public Element getPrevMove() {
    return super.getPrevMove();
  }

  public void setPrevMove(Element e) {
    super.setPrevMove(e);
  }
  @Override
  public Element play() {
    Element e;

    if (firstMove) {
      Random rand = new Random();
      int n = rand.nextInt(getMoves().size())+1;
      e = getMoves().get(n);
      firstMove = false;
    }
    else {
      e = super.getOpponent().getPrevMove();
    }
    return e;
  }
}
