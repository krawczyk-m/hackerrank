package sorting.quick;


import java.util.Scanner;

public class QuickSort {

  private static void partition(int[] ar, int p, int q) {
    if (q <= p) {
      return;
    }

    int valPos = p;

    for (int i = p + 1; i <= q; ++i) {
      if (ar[i] >= ar[valPos]) {
        continue;
      }
      // else shift and insert lower
      int tmp = ar[i];
      for (int j = i - 1; j >= valPos; --j) {
        ar[j+1] = ar[j];
      }
      ar[valPos++] = tmp;
    }
    partition(ar, p, valPos - 1);
//    printArray(ar, p, valPos - 1);
    partition(ar, valPos + 1, q);
//    printArray(ar, valPos + 1, q);
  }

  public static int[] _partition(int[] ar) {
    int pivotPos = 0;
    int wall = 1;

    for (int i = 1; i < ar.length; ++i) {
      if (ar[i] >= ar[pivotPos]) {
        continue;
      }
      // else swap
      int tmp = ar[i];
      ar[i] = ar[wall];
      ar[wall++] = tmp;
    }
    int tmp = ar[wall - 1];
    ar[wall - 1] = ar[pivotPos];
    ar[pivotPos] = tmp;

    printArray(ar);
    return ar;
  }

  public static int[] quickSort(int[] arr) {
    partition(arr, 0, arr.length - 1);
    return arr;
  }

  private static void printArray(int[] ar) {
    printArray(ar, 0, ar.length - 1);
  }

  private static void printArray(int[] ar, int p, int q) {
    if (q <= p) {
      return;
    }

    for (int i = p; i <= q; ++i) {
      System.out.print(ar[i]+" ");
    }
    System.out.println("");
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int[] ar = new int[n];

    for(int i=0;i<n;i++){
      ar[i]=in.nextInt();
    }

    quickSort(ar);
    printArray(ar);
  }
}
