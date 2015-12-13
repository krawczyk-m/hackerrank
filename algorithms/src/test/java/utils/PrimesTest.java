package utils;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PrimesTest {

  @Test
  public void testPrimes() {
    long MAX = 10;
    ArrayList<Long> expected = new ArrayList<Long>();
    expected.addAll(Arrays.asList(2L, 3L, 5L, 7L));
    assertEquals(expected, Primes.getPrimes(MAX));

    MAX = 20;
    expected.addAll(Arrays.asList(11L, 13L, 17L, 19L));
    assertEquals(expected, Primes.getPrimes(MAX));

    MAX = 72;
    expected.addAll(Arrays.asList(23L, 29L, 31L, 37L, 41L, 43L, 47L, 53L, 59L, 61L, 67L, 71L));
    assertEquals(expected, Primes.getPrimes(MAX));

    MAX = 100;
    expected.addAll(Arrays.asList(73L, 79L, 83L, 89L, 97L));
    assertEquals(expected, Primes.getPrimes(MAX));
  }
}
