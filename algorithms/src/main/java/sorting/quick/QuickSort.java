package sorting.quick;


import java.util.Scanner;

public class QuickSort {

  public static int[] partition(int[] ar) {
    int valPos = 0;

    for (int i = 1; i < ar.length; ++i) {
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
    printArray(ar);
    return ar;
  }

  private static void printArray(int[] ar) {
    for(int n: ar){
      System.out.print(n+" ");
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
    partition(ar);
  }
}
