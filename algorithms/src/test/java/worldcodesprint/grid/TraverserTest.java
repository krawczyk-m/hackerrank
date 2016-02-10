package worldcodesprint.grid;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class TraverserTest {

  static Grid grid;
  @BeforeClass
  public static void setUp() {
    grid = new Grid(6, 6);
    grid.fill("BGBBGB" +
        "GGGGGG" +
        "BGBBGB" +
        "GGGGGG" +
        "BGBBGB" +
        "BGBBGB");
  }

  @Test
  public void traverserTest() {
    assertTrue(new Plus(1, 1, 2).compareTo(Traverser.plusFrom(grid, 1, 1)));
    assertTrue(new Plus(0, 4, 1).compareTo(Traverser.plusFrom(grid, 0, 4)));
  }


}
