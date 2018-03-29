package csci305.javalab;
import java.util.*;

public class MyBot extends Player {
  private Map<Integer, Element> moves;

  public MyBot(String name) {
    super(name);
  }

  public String getName() {
    return super.getName();
  }

  public void setMoves(Map<Integer, Element> moves) {
    this.moves = moves;
  }

  public Element getPrevMove() {
    return super.getPrevMove();
  }

  public void setPrevMove(Element e) {
    super.setPrevMove(e);
  }
  @Override
  public Element play() {
    return new Rock("Rock");
  }

}
