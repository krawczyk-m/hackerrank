package sorting;

import java.util.Scanner;

public class SherlockPairs {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int T = in.nextInt();


    final int LIMIT = 1000000;

    for (int t = 0; t < T; ++t) {
      long pairs = 0;
      int N = in.nextInt();

      long[] counts = new long[LIMIT];

      for (int n = 0; n < N; ++n) {
        int i = in.nextInt();
        counts[i]++;
      }

      for (int i = 0; i < LIMIT; ++i) {
        if (counts[i] > 1) {
          pairs += counts[i] * (counts[i] - 1);
        }
      }
      System.out.println(pairs);
    }

  }
}
