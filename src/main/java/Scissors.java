package csci305.javalab;

public class Scissors extends Element {
  private String name;

  public Scissors() {}
  public Scissors(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
  @Override
  public void compareTo(Element e) {

  }
}
