package csci305.javalab;

public class Paper extends Element {

    public Paper(String name) {
      super(name);
    }

    public String getName() {
      return super.getName();
    }
    @Override
    public String compareTo(Element e) {
      Outcome o = new Outcome (getName(), e.getName());
      return o.toString();
    }
}
