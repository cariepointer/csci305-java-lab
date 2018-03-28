package csci305.javalab;
import java.util.*;
import java.util.Random;

public class RandomBot extends Player {
  private Map<Integer, Element> moves;
  public RandomBot(String name) {
    super(name);
  }

  public String getName() {
    return super.getName();
  }

  public void setMoves(Map<Integer, Element> moves) {
    this.moves = moves;
  }

  @Override
  public Element play() {
    Random rand = new Random();
    int n = rand.nextInt(moves.size())+1;
    Element e = moves.get(n);
    return e;
  }
}
