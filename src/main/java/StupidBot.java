package csci305.javalab;

/**
* Class StupidBot only knows of the move "Rock" and always plays this move
*/
public class StupidBot extends Player {

  public StupidBot(String name) {
    super(name);
  }

  public String getName() {
    return super.getName();
  }

  @Override
  public Element play() {
    Element rock = new Rock("Rock"); //Always playing Rock
    return rock;
  }
}
