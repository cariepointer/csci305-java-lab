package csci305.javalab;

/**
*  Class Rock is one of the five moves and a child of Element
*/
public class Rock extends Element {

    public Rock(String name) {
      super(name);
    }

    public String getName() {
      return super.getName();
    }
    @Override
    public Outcome compareTo(Element e) {
      Outcome o = new Outcome (getName(), e.getName()); // Compare using Rock and opponent's move
      return o;
    }
}
