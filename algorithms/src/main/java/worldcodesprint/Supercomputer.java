package worldcodesprint;

import worldcodesprint.grid.Color;
import worldcodesprint.grid.Grid;

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

    grid.print();
  }
}
