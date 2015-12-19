package euler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmallestMultipleTest {
  @Test
  public void testSmallesMutliple() {
    assertEquals(6, SmallestMultiple.smallestMultiple(3));
    assertEquals(2520, SmallestMultiple.smallestMultiple(10));
  }
}
