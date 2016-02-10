package worldcodesprint.grid;

public class Plus {

  int row;
  int column;
  int range;

  public Plus(int row, int column, int range) {
    this.row = row;
    this.column = column;
    this.range = range;
  }

  public int row() {
    return row;
  }

  public int column() {
    return column;
  }

  public int range() {
    return range;
  }

  public void increaseRange() {
    range++;
  }

  public void decreaseRange() {
    range--;
  }

  public boolean compareTo(Plus plus) {
    return this.row == plus.row &&
        this.column == plus.column &&
        this.range == plus.range;
  }

  public int area() {
    return 4 * range + 1;
  }
}
