package euler;

import java.util.Scanner;

public class SmallestMultiple {

  public static int gcd(int a, int b) {
    if (b != 0) {
      return gcd(b, a % b);
    } else {
      return a;
    }
  }

  public static int lcm(int a, int b) {
    return a * b / gcd(a,b);
  }

  public static long smallestMultiple(int N) {
    int multiple = 1;
    for (int i = 2 ; i <= N; ++i) {
      multiple = lcm(multiple, i);
    }

    return multiple;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int T = in.nextInt();

    for (int t = 0; t < T; ++t) {
      int N = in.nextInt();

      System.out.println(smallestMultiple(N));
    }
  }
}
