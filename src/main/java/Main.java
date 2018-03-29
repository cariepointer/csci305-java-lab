package csci305.javalab;
import java.util.*;

public class Main {
  private static final Map<Integer, Element> moves = new HashMap<Integer, Element>();

  public static void main(String args[]) {
    moves.put(1, new Rock("Rock"));
    moves.put(2, new Paper("Paper"));
    moves.put(3, new Scissors("Scissors"));
    moves.put(4, new Spock("Spock"));
    moves.put(5, new Lizard("Lizard"));

    RandomBot rb = new RandomBot("RandomBot");
    rb.setMoves(moves);
    System.out.println(rb.play().getName());
    IterativeBot ib = new IterativeBot("IterativeBot");
    ib.setMoves(moves);
    //System.out.println(ib.play().getName());
  }

}
