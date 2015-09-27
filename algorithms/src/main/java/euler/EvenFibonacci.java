package euler;

import java.math.BigInteger;
import java.util.Scanner;

public class EvenFibonacci {

  public static BigInteger evenFibonacciSum(long bound) { // bound >= 10
    long n1 = 1;
    long n2 = 2;

    BigInteger sum = BigInteger.ZERO;
    sum = sum.add(BigInteger.valueOf(n2));

    for (long next = n2 + n1; next < bound; next = n2 + n1) {
      if (next % 2 == 0) {
        sum = sum.add(BigInteger.valueOf(next));
      }

      n1 = n2;
      n2 = next;
    }

    return sum;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int T = in.nextInt();

    for (int t = 0; t < T; ++t) {
      long N = in.nextLong();

      System.out.println(evenFibonacciSum(N));
    }
  }
}
