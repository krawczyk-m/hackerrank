package worldcodesprint.grid;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GridTest {

  @Test
  public void gridTest() {
    Grid grid = new Grid(5, 4);

    assertEquals(Color.NONE, grid.get(4, 3).get());

    grid.set(4, 3, Color.BAD);
    assertEquals(Color.BAD, grid.get(4, 3).get());

    grid.set(4, 3, Color.GOOD);
    assertEquals(Color.GOOD, grid.get(4, 3).get());
  }
}
