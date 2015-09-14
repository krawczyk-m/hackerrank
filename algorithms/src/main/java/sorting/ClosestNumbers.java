package sorting;

import sorting.quick.QuickSort;

import java.util.Scanner;

public class ClosestNumbers {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    int[] arr = new int[N];

    for (int i = 0; i < N; ++i) {
      arr[i] = in.nextInt();
    }

    String closest = closestNumbers(arr);
    System.out.println(closest);
  }

  public static String closestNumbers(int[] arr) {
    assert arr.length >= 2;
    if (arr.length == 0) return "";

    arr = QuickSort.quickSort(arr);

    int lowest = Math.abs(arr[1] - arr[0]);
    StringBuilder ret = new StringBuilder("").
        append(arr[0] + " ").
        append(arr[1] + " ");

    for (int i = 1; i < arr.length - 1; ++i) {
      int abs = Math.abs(arr[i+1] - arr[i]);
      if (abs == lowest) {
        ret.append(arr[i] + " ").
            append(arr[i+1] + " ");
      } else if (abs < lowest) {
        lowest = abs;
        ret = new StringBuilder("").
            append(arr[i] + " ").
            append(arr[i+1] + " ");
      }
    }

    return ret.toString().trim();
  }
}
