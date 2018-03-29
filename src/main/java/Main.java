package csci305.javalab;
import java.util.*;

public class Main {
  private static final Map<Integer, Element> moves = new HashMap<Integer, Element>();
  private static final Scanner s = new Scanner(System.in);

  public static void main(String args[]) {

    moves.put(1, new Rock("Rock"));
    moves.put(2, new Paper("Paper"));
    moves.put(3, new Scissors("Scissors"));
    moves.put(4, new Spock("Spock"));
    moves.put(5, new Lizard("Lizard"));

    System.out.println("Welcome to Rock, Paper, Scissors, Lizard, Spock, implemented by Carie Pointer");
    System.out.println("Please choose two players:");
    System.out.println("(1) Human");
    System.out.println("(2) StupidBot");
    System.out.println("(3) RandomBot");
    System.out.println("(4) IterativeBot");
    System.out.println("(5) LastPlayBot");
    System.out.println("(6) MyBot");

    System.out.print("Select Player 1: ");
    Player p1 = pickPlayer(1);
    System.out.print("Select Player 2: ");
    Player p2 = pickPlayer(2);

    System.out.println("Player 1: " + p1.getName() + " vs. Player 2: " + p2.getName() + ". Go!");

    if (p1.getName() == "LastPlayBot") {
      p1.setOpponent(p2);
    }
    else if (p2.getName() == "LastPlayBot") {
      p2.setOpponent(p1);
    }

    Element e1;
    Element e2;

    for (int i = 0; i <4; i++) {
      e1 = p1.play();
      e2 = p2.play();
      System.out.println("Round "+(i+1)+ ":");
      System.out.println("\tPlayer 1 chose "+ e1.getName());
      System.out.println("\tPlayer 2 chose "+ e2.getName());
      System.out.println(e1.compareTo(e2));
      System.out.println("=============================");
      p1.setPrevMove(e1);
      p2.setPrevMove(e2);
    }

  }

  public static Player pickPlayer(int playerNum) {

    int n = s.nextInt();
    while (n > 6 || n < 1) {
      System.out.println("Invalid choice. Please try again");
      System.out.print("Select Player " + playerNum + ": ");
      n = s.nextInt();
    }

    Player player;

    switch (n) {
      case 1: Human hp = new Human("Human");
              hp.setMoves(moves);
              player = hp;
              break;
      case 2: StupidBot sb = new StupidBot("StupidBot");
              player = sb;
              break;
      case 3: RandomBot rb = new RandomBot("RandomBot");
              rb.setMoves(moves);
              player = rb;
              break;
      case 4: IterativeBot ib = new IterativeBot("IterativeBot");
              ib.setMoves(moves);
              player = ib;
              break;
      case 5: LastPlayBot lb = new LastPlayBot("LastPlayBot");
              lb.setMoves(moves);
              player = lb;
              break;
      case 6: MyBot mb = new MyBot("MyBot");
              player = mb;
              break;
      default: player = null;
              break;

    }
    return player;
  }

}
