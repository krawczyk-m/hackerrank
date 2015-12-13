package euler;

import utils.Primes;

import java.util. Scanner;

public class LargestPrimeFactor {

  public static long getLargestPrimeFactor(long N) {
    long largestPrime = 1;
    long factorLimit = N / 2 + 1;

    if (N % 2 == 0) {
      for (largestPrime = 2; N % 2 == 0;) {
        N /= 2;
      }
    }

    for (long divisor = 3; divisor < factorLimit; divisor += 2) {
      if (N % divisor == 0) {
        if (Primes.isPrime(divisor)) {
          largestPrime = divisor;
        }
        for (; N % largestPrime == 0;) {
          N /= divisor;
          factorLimit = N / 2 + 1;
        }
      }
    }

    if (N > largestPrime && Primes.isPrime(N)) {
      return N;
    }

    return largestPrime;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int T = in.nextInt();

    for (int t = 0; t < T; ++t) {
      long N = in.nextLong();

      System.out.println(getLargestPrimeFactor(N));
    }
  }
}
