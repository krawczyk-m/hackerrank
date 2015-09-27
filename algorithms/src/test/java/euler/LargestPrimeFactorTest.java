package euler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestPrimeFactorTest {

  @Test
  public void testLargestPrimeFactor() {
    long N = 10;
    assertEquals(5, LargestPrimeFactor.getLargestPrimeFactor(N));

    N *= 5*7;
    assertEquals(7, LargestPrimeFactor.getLargestPrimeFactor(N));

    N *= 8;
    assertEquals(7, LargestPrimeFactor.getLargestPrimeFactor(N));

    N *= 17;
    assertEquals(17, LargestPrimeFactor.getLargestPrimeFactor(N));

    N = 67;
    assertEquals(67, LargestPrimeFactor.getLargestPrimeFactor(N));

    N *= 997;
    assertEquals(997, LargestPrimeFactor.getLargestPrimeFactor(N));

    N *= 9 * 88 * 23 * 44;
    assertEquals(997, LargestPrimeFactor.getLargestPrimeFactor(N));
  }
}
