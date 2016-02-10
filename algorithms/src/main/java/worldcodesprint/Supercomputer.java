package worldcodesprint;

import worldcodesprint.grid.Color;
import worldcodesprint.grid.Grid;
import worldcodesprint.grid.Plus;
import worldcodesprint.grid.Traverser;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Supercomputer {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int rows = in.nextInt();
    int columns = in.nextInt();

    Grid grid = new Grid(rows, columns);

    for (int i = 0; i < rows; ++i) {
      String colors = in.next();
      for (int j = 0; j < columns; ++j) {
        grid.set(i, j, Color.COLORMAP.get(colors.charAt(j)));
      }
    }

    List<Plus> pluses = Traverser.findPluses(grid);
    System.out.println(maxArea(pluses));
  }

  private static int maxArea(List<Plus> pluses) {
    Collections.sort(pluses, (p1, p2) -> new Integer(p1.area()).compareTo(p2.area()));

    return 0;
  }

  public static boolean doPlusesIntersect(Plus bigger, Plus smaller) {
    int boundLeft = bigger.column() - bigger.range();
    int boundRight = bigger.column() + bigger.range();
    int boundUp = bigger.row() - bigger.range();
    int boundDown = bigger.row() + bigger.range();

    int diffRows = Math.abs(bigger.row() - smaller.row());
    int diffColumns = Math.abs(bigger.column() - smaller.column());

    if (diffRows == 0 || diffColumns == 0) {
      return (diffRows < bigger.range() + smaller.range() ||
          diffColumns < bigger.range() + smaller.range());
    } else if ((smaller.row() < boundDown || smaller.row() > boundUp ) &&
        (smaller.column() < boundLeft || smaller.column() > boundRight)) {
      return false;
    } else {
      return diffRows <= smaller.range() || diffColumns <= smaller.range();
    }
  }
}
