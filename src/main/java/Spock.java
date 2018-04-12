package csci305.javalab;

/**
*  Class Spock is one of the five moves and a child of Element
*/
public class Spock extends Element {

    public Spock(String name) {
      super(name);
    }

    public String getName() {
      return super.getName();
    }
    @Override
    public Outcome compareTo(Element e) {
      Outcome o = new Outcome (getName(), e.getName()); // Compare using Spock and opponent's move
      return o;
    }
}
