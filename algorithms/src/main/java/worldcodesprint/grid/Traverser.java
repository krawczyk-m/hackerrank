package worldcodesprint.grid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Traverser {

  public static List<Plus> findPluses(Grid grid) {
    List<Plus> pluses = new ArrayList<Plus>();

    for (int i = 0; i < grid.rowSize(); ++i) {
      for (int j = 0; j < grid.columnSize(); ++j) {
        Node center = grid.get(i, j);
        if (isGoodNode(center)) {
          pluses.add(plusFrom(grid, i, j));
        }
      }
    }

    return pluses;
  }

  public static Plus plusFrom(Grid grid, int row, int column) {
    int maxUP = traverse(grid, row, column, new Vector<>(Arrays.asList(0, -1)));
    int maxDOWN = traverse(grid, row, column, new Vector<>(Arrays.asList(0, 1)));
    int maxLEFT = traverse(grid, row, column, new Vector<>(Arrays.asList(-1, 0)));
    int maxRIGHT = traverse(grid, row, column, new Vector<>(Arrays.asList(1, 0)));


    int rangeV = Math.min(maxUP, maxDOWN);
    int rangeH = Math.min(maxLEFT, maxRIGHT);

    int range = Math.min(rangeH, rangeV);

    return new Plus(row, column, range);
  }

  private static int traverse(Grid grid, int row, int column, Vector<Integer> direction) {
    int range = 1;

    while (isGoodNode(grid.get(row + direction.get(1), column + direction.get(0)))) {
      range++;
      row += direction.get(1);
      column += direction.get(0);
    }

    return range;
  }

  private static boolean isGoodNode(Node node) {
    return node != null && node.get() == Color.GOOD;
  }
}
