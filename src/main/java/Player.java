package csci305.javalab;
import java.util.*;

public abstract class Player {
  private String name;
  private Element prevMove;
  private Player opponent;
  private Map<Integer, Element> moves;

  public Player() {}
  public Player(String name) {
    this.name = name;
  }

  public void setOppPrevMove(Element e) {
    this.prevMove = e;
  }

  public Element getOppPrevMove() {
    return prevMove;
  }

  public String getName() {
    return name;
  }

  public void setMoves(Map<Integer, Element> moves) {
    this.moves = moves;
  }

  public Map<Integer, Element> getMoves() {
    return moves;
  }

  public void setOpponent(Player opponent) {
    this.opponent = opponent;
  }

  public Player getOpponent() {
    return opponent;
  }

  public abstract Element play();
}
