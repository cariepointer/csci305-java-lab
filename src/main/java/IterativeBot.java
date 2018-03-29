package csci305.javalab;
import java.util.*;

public class IterativeBot extends Player {

  private Iterator<Element> i;

  public IterativeBot(String name) {
    super(name);
  }

  public String getName() {
    return super.getName();
  }

  public void setMoves(Map<Integer, Element> moves) {
    super.setMoves(moves);
    i = moves.values().iterator();
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
    if (!i.hasNext()) {
      i = getMoves().values().iterator();
    }
    Element e = i.next();
    return e;
  }
}
