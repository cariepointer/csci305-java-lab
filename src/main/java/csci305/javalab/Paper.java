package csci305.javalab;

public class Paper extends Element {
  private String name;

  public Paper() {}
  public Paper(String name) {
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
