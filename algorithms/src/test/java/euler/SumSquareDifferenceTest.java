package euler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumSquareDifferenceTest {
  @Test
  public void testSumOfSquares() {
    assertEquals(1, SumSquareDifference.sumOfSquares(1));
    assertEquals(5, SumSquareDifference.sumOfSquares(2));
    assertEquals(385, SumSquareDifference.sumOfSquares(10));
  }

  @Test
  public void testSquareOfSum() {
    assertEquals(1, SumSquareDifference.squareOfSum(1));
    assertEquals(9, SumSquareDifference.squareOfSum(2));
    assertEquals(36, SumSquareDifference.squareOfSum(3));
    assertEquals(3025, SumSquareDifference.squareOfSum(10));
  }
}
