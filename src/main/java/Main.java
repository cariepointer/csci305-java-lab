package csci305.javalab;
import java.util.*;

public class Main {
  private static final Map<String, Element> moves = new HashMap<String, Element>();

  public static void main(String args[]) {
    moves.put("Rock", new Rock("Rock"));
    moves.put("Paper", new Paper("Paper"));
    moves.put("Scissors", new Rock("Scissors"));
    moves.put("Spock", new Rock("Spock"));
    moves.put("Lizard", new Rock("Lizard"));


  }

}
