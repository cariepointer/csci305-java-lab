package csci305.javalab;
import java.util.*;

public class RandomBot extends Player {
  private Map moves;
  public RandomBot(String name) {
    super(name);
  }

  public String getName() {
    return super.getName();
  }

  public void setMoves(Map moves) {
    this.moves = moves;
  }

  @Override
  public Element play() {
    Element rock = new Rock("Rock");
    return rock;
  }
}
