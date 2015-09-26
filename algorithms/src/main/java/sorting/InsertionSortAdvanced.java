package sorting;

import sorting.merge.MergeSort;

import java.util.Scanner;

public class InsertionSortAdvanced {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int T = in.nextInt();

    for (int t = 0; t < T; ++t) {
      int N = in.nextInt();

      int[] arr = new int[N];

      for (int n = 0; n < N; ++n) {
        arr[n] = in.nextInt();
      }

      System.out.println(MergeSort.mergeSort(arr, true));
    }
  }
}
