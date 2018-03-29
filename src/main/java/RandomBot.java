package csci305.javalab;
import java.util.*;
import java.util.Random;

public class RandomBot extends Player {
  private Map<Integer, Element> moves;
  private Random rand;

  public RandomBot(String name) {
    super(name);
  }

  public String getName() {
    return super.getName();
  }

  public void setMoves(Map<Integer, Element> moves) {
    this.moves = moves;
    rand = new Random();
  }

  @Override
  public Element play() {

    int n = rand.nextInt(moves.size())+1;
    Element e = moves.get(n);
    //super.setPrevMove(e);
    return e;
  }
}
