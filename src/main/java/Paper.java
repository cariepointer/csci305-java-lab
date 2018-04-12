package csci305.javalab;

/**
*  Class Paper is one of the five moves and a child of Element
*/
public class Paper extends Element {

    public Paper(String name) {
      super(name);
    }

    public String getName() {
      return super.getName();
    }
    @Override
    public Outcome compareTo(Element e) {
      Outcome o = new Outcome (getName(), e.getName()); // Compare using Paper and opponent's move
      return o;
    }
}
