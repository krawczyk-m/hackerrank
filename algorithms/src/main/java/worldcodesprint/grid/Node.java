package worldcodesprint.grid;

public class Node{

  Color color;
  int x;
  int y;

  public Node(int x, int y) {
    this.x = x;
    this.y = y;
    this.color = Color.NONE;
  }

  public Color get() {
    return color;
  }

  public void set(Color color) {
    this.color = color;
  }

  @Override
  public String toString() {
    return this.color.toString();
  }
}
