package hourrank5;

import java.util.Scanner;

public class AJ {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();

    int max = 0;

    for (int i = 1; i < N; ++i) {
      int A = N - i;
      int w = (int) Math.floor(A/ 2.0);
      int l = (int) Math.ceil(A/ 2.0);

      int V = i * w * l;

      max = Math.max(max, V);
    }

    System.out.println(max);
  }
}

