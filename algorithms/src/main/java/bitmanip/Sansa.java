package bitmanip;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sansa {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int T = in.nextInt();

    for (int t = 0; t < T; ++t) {
      List<Integer> arr = new ArrayList<>();
      int N = in.nextInt();

      for (int n = 0; n < N; ++n) {
        arr.add(in.nextInt());
      }
      int size = arr.size();
      int xor = 0;
      if (size % 2 != 0) {
        for (int i = 0; i < size; i+=2) {
          xor ^= arr.get(i);
        }
      }
      System.out.println(xor);
    }
  }

  private static Integer xor(List<Integer> arr) {
    int xor = 0;

    int len = arr.size();
    for (int pos = 0; pos < len; ++pos) {
      int xorPos = 0;
      for (int size = 1; size < len - pos + 1; ++size) {
        int xorSubarr = 0;
        List<Integer> subarray = arr.subList(pos, pos + size);
        for (Integer i : subarray) {
          xorSubarr ^= i;
        }
        xorPos ^= xorSubarr;
      }
      xor ^= xorPos;
    }

    return xor;
  }
}
