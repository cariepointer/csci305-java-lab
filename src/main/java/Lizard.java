package csci305.javalab;

/*
* Class Lizard is one of the five moves and a child of Element
*/
public class Lizard extends Element {

  public Lizard(String name) {
    super(name);
  }

  public String getName() {
    return super.getName();
  }
  @Override
  public Outcome compareTo(Element e) {
    Outcome o = new Outcome (getName(), e.getName()); //Compare using Lizard and opponent's move
    return o;
  }
}
