package csci305.javalab;
import java.util.*;

public class Main {
  private static final Map<String, Element> m = new HashMap<String, Element>();

  public static void main(String args[]) {
    m.put("Rock", new Rock("Rock"));
    m.put("Paper", new Paper("Paper"));
    m.put("Scissors", new Rock("Scissors"));
    m.put("Spock", new Rock("Spock"));
    m.put("Lizard", new Rock("Lizard"));
  }
}
