package utils;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class Primes {

  private static long MAX_NUMBER = 1000000000000L;
  private static int MAX_PRIME = (int) Math.sqrt(MAX_NUMBER);

  private static List<Integer> sieve = null;

  public static List<Integer> getPrimes() {
    if (sieve == null) {
      initSieve();
    }
    return sieve;
  }

  private static void initSieve() {
    sieve = new ArrayList<Integer>();

    BitSet bs = new BitSet(MAX_PRIME + 1);
    bs.flip(2, MAX_PRIME + 1);

    for (int i = 2; i < (int) Math.sqrt(MAX_PRIME + 1); ++i) {
      if (bs.get(i)) {
        for (int j = i * i; j < MAX_PRIME + 1; j += i) {
          bs.set(j, false);
        }
      }
    }

    for (int i = 2; i < bs.size(); ++i) {
      if (bs.get(i)) {
        sieve.add(i);
      }
    }
  }
}
