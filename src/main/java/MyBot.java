package csci305.javalab;
import java.util.*;

public class MyBot extends Player {

  public MyBot(String name) {
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

  @Override
  public Element play() {
    return new Rock("Rock");
  }

}
