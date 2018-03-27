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
  public void compareTo(Element e) {

  }
}
