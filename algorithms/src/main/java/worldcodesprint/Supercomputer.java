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

    System.out.println(maxAreaProduct(grid));
  }

  public static int maxAreaProduct(Grid grid) {
    List<Plus> pluses = Traverser.findPluses(grid);
    return maxAreaProduct(pluses);
  }

  public static int maxAreaProduct(List<Plus> pluses) {
    if (pluses.size() < 2) {
      return 0;
    }

    int product = -1;
    while(product == -1) {
      Collections.sort(pluses, (p1, p2) -> -1 * Integer.compare(p1.area(), p2.area())); // reverse order

      int secondLargestArea = pluses.get(1).area();
      for (int i = 1; i < pluses.size(); ++i) {
        if (pluses.get(i).area() < secondLargestArea) {
          break;
        } else if (!doPlusesIntersect(pluses.get(0), pluses.get(i))) {
          product = pluses.get(0).area() * pluses.get(1).area();
        }
      }

      pluses.get(0).decreaseRange();
    }
    return product;
  }

  public static boolean doPlusesIntersect(Plus bigger, Plus smaller) {
    int boundLeft = bigger.column() - bigger.range();
    int boundRight = bigger.column() + bigger.range();
    int boundUp = bigger.row() - bigger.range();
    int boundDown = bigger.row() + bigger.range();

    int diffRows = Math.abs(bigger.row() - smaller.row());
    int diffColumns = Math.abs(bigger.column() - smaller.column());

    if (diffRows == 0) {
      return diffColumns  <= bigger.range() + smaller.range();
    } else if (diffColumns == 0) {
      return (diffRows <= bigger.range() + smaller.range());
    } else if ((smaller.row() < boundDown || smaller.row() > boundUp ) &&
        (smaller.column() < boundLeft || smaller.column() > boundRight)) {
      return false;
    } else {
      return diffRows <= smaller.range() || diffColumns <= smaller.range();
    }
  }
}
