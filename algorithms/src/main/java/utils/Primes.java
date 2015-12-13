package utils;

import java.util.ArrayList;
import java.util.List;

public class Primes {

  public static List<Long> getPrimes(long MAX_PRIME) {
    ArrayList<Long> primes = new ArrayList<Long>();

    primes.add(2L);

    for (long number = 3L; number < MAX_PRIME; number += 2) {
      for (Long prime : primes) {
        if (prime > number / 2) {
          primes.add(number);
          break;
        } else if (number % prime == 0) {
          break;
        }
      }
    }

    return primes;
  }

  public static boolean isPrime(long N) {
    List<Long> primes = getPrimes((long) Math.sqrt(N) + 1);

    for (Long prime : primes) {
      if (N % prime == 0) {
        return false;
      }
    }
    return true;
  }
}
