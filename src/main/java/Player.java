package csci305.javalab;
import java.util.*;

/**
* Class Player is the parent class of all Bots
*/
public abstract class Player {
  private String name;
  private Element prevMove;
  private Player opponent;
  private Map<Integer, Element> moves;

  public Player() {}
  public Player(String name) { //Constructor with name parameter
    this.name = name;
  }

  // Method used for LastPlayBot; Called by Main()
  public void setOppPrevMove(Element e) {
    this.prevMove = e;
  }

  // Return opponent's previous move for LastPlayBot play() method
  public Element getOppPrevMove() {
    return prevMove;
  }

  public String getName() {
    return name;
  }

  // Add new moves to HashMap
  public void setMoves(Map<Integer, Element> moves) {
    this.moves = moves;
  }

  // Get all moves in HashMap
  public Map<Integer, Element> getMoves() {
    return moves;
  }

  //Play method implemented in children classes
  public abstract Element play();
}
