public class Primes {

  public static boolean isPrime(int n) {
    if (n == 0 || n == 1) {
      return false;
    }
    if (n != 2 && n % 2 == 0) {
      return false;
    } else {
      int limit = (int) Math.sqrt((double) n) + 1;
      for (int i = 3; i < limit; i+=2) {
        if (n % i == 0) {
          return false;
        }
      }
    }
    return true;
  }
}
