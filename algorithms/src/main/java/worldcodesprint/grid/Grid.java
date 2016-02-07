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
    return grid.get(n-1).get(m-1);
  }

  public void set(int n, int m, Color color) {
    grid.get(n-1).get(m-1).set(color);
  }

  private List<Node> createEmptyRow() {
    List<Node> row = new ArrayList<>();

    for (int i = 0; i < columns; ++i) {
      row.add(new Node());
    }

    return row;
  }
}
