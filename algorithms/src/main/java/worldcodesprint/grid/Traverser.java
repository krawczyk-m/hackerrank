package worldcodesprint.grid;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Traverser {

//  public static List<Plus> findPluses(Grid grid) {
//
//  }

  public static Plus plusFrom(Grid grid, int centerX, int centerY) {
    int maxUP = traverse(grid, centerX, centerY, new Vector<>(Arrays.asList(0, -1)));
    int maxDOWN = traverse(grid, centerX, centerY, new Vector<>(Arrays.asList(0, 1)));
    int maxLEFT = traverse(grid, centerX, centerY, new Vector<>(Arrays.asList(-1, 0)));
    int maxRIGTH = traverse(grid, centerX, centerY, new Vector<>(Arrays.asList(1, 0)));


    int rangeV = Math.min(maxUP, maxDOWN);
    int rangeH = Math.min(maxLEFT, maxRIGTH);

    int range = Math.min(rangeH, rangeV);

    return new Plus(centerX, centerY, range);
  }

  private static int traverse(Grid grid, int centerX, int centerY, Vector<Integer> direction) {
    int range = 1;
    int row = centerX;
    int column = centerY;

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
