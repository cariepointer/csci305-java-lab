package csci305.javalab;
import java.util.*;

public class IterativeBot extends Player {

  private Map<Integer, Element> moves;
  private Iterator<Element> i;

  public IterativeBot(String name) {
    super(name);
  }

  public String getName() {
    return super.getName();
  }

  public void setMoves(Map<Integer, Element> moves) {
    this.moves = moves;
     i = moves.values().iterator();
  }

  @Override
  public Element play() {
    if (!i.hasNext()) {
      i = moves.values().iterator();
    }
    Element e = i.next();
    return e;
  }
}
