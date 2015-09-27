package euler;

import java.math.BigInteger;
import java.util.Scanner;

public class Multiples {

  public static BigInteger sumOfMultiples(long below, long[] multipleOf) {
    BigInteger sum = BigInteger.ZERO;

    for (long num: multipleOf) {
      BigInteger addend = sumOf(below, num);
      sum = sum.add(addend);
    }

    // subtract duplicates - assume multipleOf.length == 2
    // assume numbers in multipleOf ar coprime
    long num = multipleOf[0] * multipleOf[1];
    BigInteger subtrahend = sumOf(below, num);

    return sum.subtract(subtrahend);
  }

  private static BigInteger sumOf(long below, long num) {
    long an = findLastMultiple(below, num);
    long numbers = (an - num) / num + 1;

    long dividend = num + an;
    if (dividend % 2 == 0) {
      dividend /= 2;
    } else {
      numbers /= 2;
    }
    BigInteger sum = BigInteger.valueOf(dividend);
    return sum.multiply(BigInteger.valueOf(numbers));
  }

  private static long findLastMultiple(long below, long num) {
    long numbers = (long) Math.floor((below - 1) / num);
    return num + num * (numbers - 1);
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    long T = in.nextLong();

    for (long t = 0; t < T; ++t) {
      long N = in.nextLong();

      System.out.println(sumOfMultiples(N, new long[] {3, 5}));
    }
  }
}
