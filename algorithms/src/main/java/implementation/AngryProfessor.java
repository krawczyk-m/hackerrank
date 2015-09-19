package implementation;

import java.util.Scanner;

public class AngryProfessor {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int T = in.nextInt();

    for (int i = 0; i < T; ++i) {
      int N = in.nextInt();
      int K = in.nextInt();

      int[] times = new int[N];

      for (int j = 0; j < N; ++j) {
        times[j] = in.nextInt();
      }

      if (isLectureCancelled(times, K)) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }

  public static boolean isLectureCancelled(int[] times, int limit) {
    int notLate = 0;
    int len = times.length;

    for (int time : times) {
      if (time <= 0) {
        notLate++;
      }
    }

    return notLate < limit;
  }
}
