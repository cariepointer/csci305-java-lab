package csci305.javalab;

public class Lizard extends Element {
  private String name;

  public Lizard() {}
  public Lizard(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
  @Override
  public String compareTo(Element e) {
    Outcome o = new Outcome (name, e.getName());
    return o.toString();
  }
}
