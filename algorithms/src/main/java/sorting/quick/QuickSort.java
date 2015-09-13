package sorting.quick;


import sorting.insertion.InsertionSort;

import java.util.Scanner;

public class QuickSort {

  public static int SWAPS = 0;

  public static int partition(int[] ar, int p, int q) {
    int pivot = ar[q];
    int wall = p;

    for (int i = p; i < q; ++i) {
      if (ar[i] >= pivot) {
        continue;
      }
      // else swap
      int tmp = ar[i];
      ar[i] = ar[wall];
      ar[wall++] = tmp;
      SWAPS++;
    }
    int tmp = ar[wall];
    ar[wall] = pivot;
    ar[q] = tmp;
    SWAPS++;

//    printArray(ar);
    return wall;
  }

  public static int[] quickSort(int[] arr) {
    quickSort(arr, 0, arr.length - 1);
    return arr;
  }

  private static void quickSort(int[] arr, int p, int q) {
    int pivotIdx;
    if (p < q) {
      pivotIdx = partition(arr, p, q);
      quickSort(arr, p, pivotIdx - 1);
      quickSort(arr, pivotIdx + 1, q);
    }
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
    int[] ar2 = new int[n];

    for(int i=0;i<n;i++){
      ar[i]=in.nextInt();
      ar2[i] = ar[i];
    }

    quickSort(ar);
    InsertionSort.insertionSort(ar2);
    System.out.println(InsertionSort.SWAPS - SWAPS);
  }
}
