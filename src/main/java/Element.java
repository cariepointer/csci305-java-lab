package csci305.javalab;

/**
* Class Element is parent class for all five moves
*/
public abstract class Element {
  private String name;

  public Element() {}
  //Constructor with name parameter
  public Element(String name) {
    this.name = name;
  }

  //Element name
  public String getName() {
    return name;
  }

  // compareTo method is implemented in children classes
  public abstract Outcome compareTo(Element e);
}
