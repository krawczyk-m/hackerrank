package euler;

import java.util.Scanner;

public class SumSquareDifference {

  public static long sumOfSquares(int n) {
    long sum = 0;

    for (int i = 1; i <= n; ++i) {
      sum += i * i;
    }

    return sum;
  }

  public static long squareOfSum(int n) {
    int first = 1;
    int last = n;

    long sum = (long) ((first + last) / 2.0 * n);
    return sum * sum;
  }

  public static long sumSquareDifference(int n) {
    long internalPartialSum = n;
    long sum = 0;

    for (int i = n - 1; i > 0; --i) {
      sum += i * internalPartialSum;
      internalPartialSum += i;
    }

    return 2 * sum;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int T = in.nextInt();

    for (int t = 0; t < T; ++t) {
      int N = in.nextInt();

      System.out.println(sumSquareDifference(N));
    }
  }
}
