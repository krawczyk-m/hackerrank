package euler;

import utils.Primes;

import java.util.List;
import java.util. Scanner;

public class LargestPrimeFactor {

  public static long getLargestPrimeFactor(long N) {
    long largestPrime = 1;

    List<Integer> primes = Primes.getPrimes();

    for (int prime: primes) {
      if (prime > (int) Math.sqrt(N)) {
        break;
      } else if (N % prime == 0) {
        while (N % prime == 0) {
          N /= prime;
        }
        largestPrime = prime;
      }
    }

    if (N > largestPrime) {
      largestPrime = N;
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
