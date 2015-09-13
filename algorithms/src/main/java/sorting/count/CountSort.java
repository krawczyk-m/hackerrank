package sorting.count;


import java.util.Scanner;

import static utils.Util.printArray;

public class CountSort {

  private static void printSorted(int[] arr) {
    for (int i = 0; i < arr.length; ++i) {
      int count = arr[i];
      for (int j = 0; j < count; ++j) {
        System.out.print(i + " ");
      }
    }
  }

  private static void printCumulative(int[] arr) {
    int lessOrEqual = 0;
    for (int i = 0; i < arr.length; ++i) {
      lessOrEqual += arr[i];
      System.out.print(lessOrEqual + " ");
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();

    int[] occurrences = new int[100];

    for (int i = 0; i < N; ++i) {
      ++occurrences[in.nextInt()];
      in.nextLine(); // discard strings
    }

//    printArray(occurrences);
//    printSorted(occurrences);
    printCumulative(occurrences);
  }
}
