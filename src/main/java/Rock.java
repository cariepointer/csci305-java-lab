package csci305.javalab;

public class Rock extends Element {
  private String name;

  public Rock() {}

  public Rock(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }


  @Override
  public void compareTo(Element e) {
    Outcome o = new Outcome (name, e.getName());

  }
}
