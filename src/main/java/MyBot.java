package csci305.javalab;
import java.util.*;

public class MyBot extends Player {
  private Random rand;
  public MyBot(String name) {
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

  @Override
  public Element play() {
    int n = rand.nextInt(3)+1;
    Element e = getMoves().get(n);
    return e;
  }

}
