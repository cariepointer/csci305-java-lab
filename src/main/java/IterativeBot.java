package csci305.javalab;
import java.util.*;

/**
* Class IterativeBot begins with one move and cycles through all the moves,
* one by one, repeating the sequence only after having played all five moves.
*/
public class IterativeBot extends Player {

  private Iterator<Element> i;

  public IterativeBot(String name) {
    super(name);
  }

  public String getName() {
    return super.getName();
  }

  public void setMoves(Map<Integer, Element> moves) {
    super.setMoves(moves); // Add moves to super class
    i = moves.values().iterator(); // Instantiate new iterator for use in play() method
  }

  public Map<Integer, Element> getMoves() {
    return super.getMoves(); //Get moves from super class
  }

  @Override
  public Element play() {
    if (!i.hasNext()) { // If we have reached the end of the moves, set iterator at the beginning
      i = getMoves().values().iterator();
    }
    Element e = i.next(); // Move is next element in the iterator
    return e;
  }
}
