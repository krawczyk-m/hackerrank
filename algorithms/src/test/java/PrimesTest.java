import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PrimesTest {

  @Test
  public void isPrimeTest() {
    assertTrue(Primes.isPrime(3));
    assertTrue(Primes.isPrime(5));
    assertTrue(Primes.isPrime(7));
    assertTrue(Primes.isPrime(31));
    assertTrue(Primes.isPrime(67));
    assertFalse(Primes.isPrime(1));
    assertFalse(Primes.isPrime(12));
    assertFalse(Primes.isPrime(4));
    assertFalse(Primes.isPrime(8));
    assertFalse(Primes.isPrime(100));
  }
}
