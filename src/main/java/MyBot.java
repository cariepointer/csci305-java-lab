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
