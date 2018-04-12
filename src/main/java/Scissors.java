package csci305.javalab;

/**
*  Class Scissors is one of the five moves and a child of Element
*/
public class Scissors extends Element {

    public Scissors(String name) {
      super(name);
    }

    public String getName() {
      return super.getName();
    }
    @Override
    public Outcome compareTo(Element e) {
      Outcome o = new Outcome (getName(), e.getName()); // Compare using Scissors and opponent's move
      return o;
    }
}
