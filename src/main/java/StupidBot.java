package csci305.javalab;

public class StupidBot extends Player {

  @Override
  public Element play() {
    Element rock = new Rock("Rock");
    return rock;
  }
}
