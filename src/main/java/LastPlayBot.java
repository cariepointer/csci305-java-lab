package csci305.javalab;

public class LastPlayBot extends Player {

  public LastPlayBot(String name) {
    super(name);
  }

  public String getName() {
    return super.getName();
  }

  @Override
  public Element play() {
    Element rock = new Rock("Rock");
    return rock;
  }
}
