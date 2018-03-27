package csci305.javalab;

public abstract class Player {
  private String name;

  public Player() {}
  public Player(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public abstract Element play();
}