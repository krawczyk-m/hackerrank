package worldcodesprint.grid;

import org.junit.BeforeClass;
import org.junit.Test;
import worldcodesprint.Supercomputer;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SupercomputerTest {

  @Test
  public void maxAreaTest() {
    List<Plus> pluses = Arrays.asList(new Plus(1, 1, 1),
        new Plus(3, 4, 1));

    assertEquals(25, Supercomputer.maxAreaProduct(pluses));

    pluses = Arrays.asList(new Plus(3, 1, 0),
        new Plus(2, 4, 1));
    assertEquals(5, Supercomputer.maxAreaProduct(pluses));
  }

  @Test
  public void maxAreaGridTest() {
    Grid grid = new Grid(6, 6);
//    grid.fill("BGBBGB" +
//        "GGGGGG" +
//        "BGBBGB" +
//        "GGGGGG" +
//        "BGBBGB" +
//        "BGBBGB");
//
//    assertEquals(25, Supercomputer.maxAreaProduct(grid));
//
//    grid = new Grid(5, 6);
//    grid.fill("GGGGGG"+
//              "GBBBGB"+
//              "GGGGGG"+
//              "GGBBGB"+
//              "GGGGGG");
//
//    assertEquals(5, Supercomputer.maxAreaProduct(grid));
//
//    grid = new Grid(4, 4);
//    grid.fill("GGGG" +
//        "GGGG" +
//        "GGGG" +
//        "GGGG");
//    assertEquals(5, Supercomputer.maxAreaProduct(grid));
//
//    grid = new Grid(15, 15);
//    grid.fill("GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG" +
//        "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG" +
//        "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG" +
//        "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG" +
//        "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
//    assertEquals(17 * 21, Supercomputer.maxAreaProduct(grid));
//
//    grid = new Grid(4, 4);
//    grid.fill("BBBB" +
//        "BBBB" +
//        "BBBB" +
//        "BBBB");
//    assertEquals(0, Supercomputer.maxAreaProduct(grid));
//
//    grid = new Grid(4, 4);
//    grid.fill("BBGB" +
//        "BBBB" +
//        "BBBB" +
//        "BBBB");
//    assertEquals(0, Supercomputer.maxAreaProduct(grid));
//
//    grid = new Grid(4, 4);
//    grid.fill("BGGB" +
//        "BBBB" +
//        "BBBB" +
//        "BBBB");
//    assertEquals(1, Supercomputer.maxAreaProduct(grid));
//
//    grid = new Grid(3, 6);
//    grid.fill("BGBBGB" +
//        "GGGGGG" +
//        "BGBBGB");
//    assertEquals(25, Supercomputer.maxAreaProduct(grid));

    grid = new Grid(13, 11);
    grid.fill("GGBBGBBGBBG" +
        "GGBBGBBGBBG" +
        "GGGGGGGGGGG" +
        "GGBBGBBGBBG" +
        "GGGGGGGGGGG" +
        "GGBBGBBGBBG" +
        "GGBBGBBGBBG" +
        "GGGGGGGGGGG" +
        "GGBBGBBGBBG" +
        "GGGGGGGGGGG" +
        "GGBBGBBGBBG" +
        "GGBBGBBGBBG" +
        "GGBBGBBGBBG");
    grid.print();
    assertEquals(221, Supercomputer.maxAreaProduct(grid));
  }
}
