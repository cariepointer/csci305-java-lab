package csci305.javalab;

public class RandomBot extends Player {

  public RandomBot(String name) {
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
