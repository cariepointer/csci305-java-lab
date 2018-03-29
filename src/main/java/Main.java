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

    RandomBot p1 = new RandomBot("RandomBot");
    //IterativeBot p2 = new IterativeBot("IterativeBot");
    //StupidBot p3 = new StupidBot("StupidBot");
    //LastPlayBot p2 = new LastPlayBot("LastPlayBot");
    Human p2 = new Human("Human");

    p1.setMoves(moves);
  //  p2.setMoves(moves);
    p2.setMoves(moves);

    //need for LastPlayBot
    //p2.setOpponent(p1);

    Element e1;
    Element e2;

    for (int i = 0; i <4; i++) {
      e1 = p1.play();
      e2 = p2.play();
      System.out.println("Round "+(i+1));
      System.out.println("P1: "+ e1.getName());
      System.out.println("P2: "+ e2.getName());
      System.out.println(e1.compareTo(e2));
      p1.setPrevMove(e1);
      p2.setPrevMove(e2);
    }




  }

}
