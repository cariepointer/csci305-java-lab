package csci305.javalab;

public class Lizard extends Element {

  public Lizard(String name) {
    super(name);
  }

  public String getName() {
    return super.getName();
  }
  @Override
  public Outcome compareTo(Element e) {
    Outcome o = new Outcome (getName(), e.getName());
    return o;
  }
}
