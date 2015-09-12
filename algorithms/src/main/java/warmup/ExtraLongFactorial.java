package warmup;


import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorial {

  public static BigInteger factorial(BigInteger n) {
    return iFactorial(n, BigInteger.ONE);
  }

  private static BigInteger iFactorial(BigInteger n, BigInteger current) {
    if (n.equals(BigInteger.ZERO)) {
      return current;
    } else {
      return iFactorial(n.subtract(BigInteger.ONE), current.multiply(n));
    }
  }

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    BigInteger n = in.nextBigInteger();

    System.out.println(factorial(n));
  }
}
