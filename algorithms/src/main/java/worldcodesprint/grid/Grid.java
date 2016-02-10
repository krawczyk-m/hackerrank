package worldcodesprint.grid;

import java.util.ArrayList;
import java.util.List;

public class Grid {


  List<List<Node>> grid;
  int rows;
  int columns;

  public Grid(int n, int m) {
    rows = n;
    columns = m;

    grid = new ArrayList<>(n);
    for (int i = 0; i < n; ++i) {
      grid.add(createEmptyRow());
    }
  }

  public Node get(int n, int m) {
    return ((n >= 0 && n < rows) && (m >= 0 && m < columns)) ? grid.get(n).get(m) : null;
  }

  public void set(int n, int m, Color color) {
    grid.get(n).get(m).set(color);
  }

  private List<Node> createEmptyRow() {
    List<Node> row = new ArrayList<>();

    for (int i = 0; i < columns; ++i) {
      row.add(new Node(rows - 1, i));
    }

    return row;
  }

  public void print() {
    for (int i = 0; i < rows; ++i) {
      for (int j = 0; j < columns; ++j) {
        System.out.print(this.get(i, j));
      }
      System.out.println();
    }
  }

  public int rowSize() {
    return rows;
  }

  public int columnSize() {
    return columns;
  }

  public void fill(String colors) {
    for (int i = 0; i < rows; ++i) {
      for (int j = 0; j < columns; ++j) {
        int index = i * columns + j;
        Color color = Color.COLORMAP.get(colors.charAt(index));
        set(i, j, color);
      }
    }
  }
}
