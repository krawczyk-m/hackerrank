package sorting.count;


import java.util.Scanner;

import static utils.Util.printArray;

public class CountSort {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();

    int[] occurrences = new int[100];

    for (int i = 0; i < N; ++i) {
      ++occurrences[in.nextInt()];
    }

    printArray(occurrences);
  }
}
