package euler;

import org.junit.BeforeClass;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class MultiplesTest {

  private static long[] multiplesOf;

  @BeforeClass
  public static void setUp() {
    multiplesOf = new long[] {3, 5};
  }

  @Test
  public void sumZero() {
    assertEquals(BigInteger.ZERO, Multiples.sumOfMultiples(1, multiplesOf));
    assertEquals(BigInteger.ZERO, Multiples.sumOfMultiples(2, multiplesOf));
    assertEquals(BigInteger.ZERO, Multiples.sumOfMultiples(3, multiplesOf));
  }

  @Test
  public void only3() {
    assertEquals(BigInteger.valueOf(3), Multiples.sumOfMultiples(4, multiplesOf));
    assertEquals(BigInteger.valueOf(3), Multiples.sumOfMultiples(5, multiplesOf));
  }

  @Test
  public void bothOnce() {
    assertEquals(BigInteger.valueOf(8), Multiples.sumOfMultiples(6, multiplesOf));
  }

  @Test
  public void multiples() {
    assertEquals(BigInteger.valueOf(60), Multiples.sumOfMultiples(17, multiplesOf));
    assertEquals(BigInteger.valueOf(495), Multiples.sumOfMultiples(46, multiplesOf));
    assertEquals(BigInteger.valueOf(2318), Multiples.sumOfMultiples(100, multiplesOf));
  }
}
