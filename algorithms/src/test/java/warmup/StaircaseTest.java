package warmup;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StaircaseTest {

  @Test
  public void testZero() {
    assertEquals("", Staircase.staircase(0));
  }

  @Test
  public void testOne() {
    assertEquals("#\n", Staircase.staircase(1));
  }

  @Test
  public void testNegative() {
    assertEquals("", Staircase.staircase(-1));
  }

  @Test
  public void testSix() {
    StringBuilder sb = new StringBuilder().
        append("     #\n").
        append("    ##\n").
        append("   ###\n").
        append("  ####\n").
        append(" #####\n").
        append("######\n");

    assertEquals(sb.toString(), Staircase.staircase(6));
  }

}
