package sorting.insertion;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

  public static int SWAPS = 0;

  private static void printArrayList(ArrayList<?> arr) {
    for (Object obj : arr) {
      System.out.print(MessageFormat.format("{0} ", obj));
    }
    System.out.println("");
  }

  public static ArrayList<Integer> _insertionSort(ArrayList<Integer> arr) {
    if (arr.size() <= 1) return arr;

    int i = arr.size() - 1;
    Integer toInsert = arr.get(i);
    --i;

    while (i > -1 && toInsert < arr.get(i)) {
      arr.set(i + 1, arr.get(i));
      --i;
      printArrayList(arr);
    }

    arr.set(i + 1, toInsert);

    return arr;
  }

  private static void printArray(int[] ar) {
    for(int n: ar){
      System.out.print(n+" ");
    }
    System.out.println("");
  }

  public static int[] insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      for (int j = i - 1; j >= 0 && arr[j] > arr[j+1]; j--) {
        int tmp = arr[j+1];
        arr[j+1] = arr[j];
        arr[j] = tmp;
        SWAPS++;
      }
//      printArray(arr);
    }
    return arr;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    ArrayList<Integer> arr = new ArrayList<Integer>();
    int[] ar = new int[N];

    for (int i = 0; i < N; i++) {
//      arr.add(in.nextInt());
      ar[i] = in.nextInt();
    }

    insertionSort(ar);
    System.out.println("insertionsort: " + SWAPS + " swaps");
  }
}
