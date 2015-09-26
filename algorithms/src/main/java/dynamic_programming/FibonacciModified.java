package dynamic_programming;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciModified {

  public static BigInteger[] MEMOS = new BigInteger[20];

  public static BigInteger getModFib(int n) {
    if (n == 0) {
      return MEMOS[0];
    } else if (n == 1) {
      return MEMOS[1];
    } else if (MEMOS[n] != null) {
      return MEMOS[n];
    } else {
      BigInteger tn1 = getModFib(n-1);
      MEMOS[n] = tn1.multiply(tn1).add(getModFib(n-2));
      return MEMOS[n];
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    MEMOS[0] = new BigInteger(in.next());
    MEMOS[1] = new BigInteger(in.next());

    int n = in.nextInt();

    System.out.println(getModFib(n - 1));
  }
}
