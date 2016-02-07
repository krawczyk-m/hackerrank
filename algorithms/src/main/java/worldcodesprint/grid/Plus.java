package worldcodesprint.grid;

public class Plus {

  int centerX;
  int centerY;
  int range;

  public Plus(int centerX, int centerY, int range) {
    this.centerX = centerX;
    this.centerY = centerY;
    this.range = range;
  }

  public void increaseRange() {
    range++;
  }

  public void decreaseRange() {
    range--;
  }

  public boolean compareTo(Plus plus) {
    return this.centerX == plus.centerX &&
        this.centerY == plus.centerY &&
        this.range == plus.range;
  }
}
