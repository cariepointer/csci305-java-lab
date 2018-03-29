package csci305.javalab;
import java.util.*;
import java.util.Random;

public class RandomBot extends Player {

  private Random rand;

  public RandomBot(String name) {
    super(name);
  }

  public String getName() {
    return super.getName();
  }

  public void setMoves(Map<Integer, Element> moves) {
    super.setMoves(moves);
    rand = new Random();
  }

  public Map<Integer, Element> getMoves() {
    return super.getMoves();
  }

  public Element getPrevMove() {
    return super.getPrevMove();
  }

  public void setPrevMove(Element e) {
    super.setPrevMove(e);
  }

  @Override
  public Element play() {

    int n = rand.nextInt(getMoves().size())+1;
    Element e = getMoves().get(n);
    return e;
  }
}
