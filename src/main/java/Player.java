package csci305.javalab;

public abstract class Player {
  private String name;
  private Element prevMove;

  public Player() {}
  public Player(String name) {
    this.name = name;
  }

  public void setPrevMove(Element e) {
    this.prevMove = e;
  }

  public Element getPrevMove() {
    return prevMove;
  }

  public String getName() {
    return name;
  }

  public abstract Element play();
}
