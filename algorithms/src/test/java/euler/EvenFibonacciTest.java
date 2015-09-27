package euler;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class EvenFibonacciTest {

  @Test
  public void testSum() {
    long bound1 = 10;
    long val = 10;
    assertEquals(BigInteger.valueOf(val), EvenFibonacci.evenFibonacciSum(bound1));

    long bound2 = 100;
    val += 34;
    assertEquals(BigInteger.valueOf(val), EvenFibonacci.evenFibonacciSum(bound2));

    long bound3 = 1000;
    val += 144 + 610;
    assertEquals(BigInteger.valueOf(val), EvenFibonacci.evenFibonacciSum(bound3));

    long bound4 = 2500;
    assertEquals(BigInteger.valueOf(val), EvenFibonacci.evenFibonacciSum(bound4));

    long bound5 = 4000;
    val += 2584;
    assertEquals(BigInteger.valueOf(val), EvenFibonacci.evenFibonacciSum(bound5));

    long bound6 = 10000;
    assertEquals(BigInteger.valueOf(val), EvenFibonacci.evenFibonacciSum(bound6));

    long bound7 = 12000;
    val += 10946;
    assertEquals(BigInteger.valueOf(val), EvenFibonacci.evenFibonacciSum(bound7));

    long bound8 = 50000;
    val += 46368;
    assertEquals(BigInteger.valueOf(val), EvenFibonacci.evenFibonacciSum(bound8));

    long bound9 = 200000;
    val += 196418;
    assertEquals(BigInteger.valueOf(val), EvenFibonacci.evenFibonacciSum(bound9));
  }
}
