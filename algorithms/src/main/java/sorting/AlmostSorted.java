package sorting;

import java.util.Scanner;

public class AlmostSorted {

  public static void print(Object o) {
    System.out.println(o + "\n");
  }

  public static String sortBySwap(int[] ar) {
    // variables for swap checks
    int toSwap = -1;
    int toSwap2 = -1;
    boolean canSwap = false;
    boolean canSwap2 = false;

    int n = ar.length;

    for (int i = 1; i < n; ++i) {
      if (ar[i] < ar[i-1]) {
        // check for swap
        if (canSwap2) {
          canSwap = false;
          break;
        } else if (toSwap == -1) {
          toSwap = i - 1;
          toSwap2 = i;
          canSwap = true;
        } else { // found second out-of-order variable
          canSwap2 = true;

          boolean canSwapFirst = true;
          canSwapFirst = canSwapFirst && (ar[i - 1] < ar[toSwap]);
          if (i != n - 1) canSwapFirst = canSwapFirst && (ar[toSwap] < ar[i + 1]);

          boolean canSwapSecond = true;
          canSwapSecond = canSwapSecond && (ar[i] < ar[toSwap + 1]);
          if (toSwap != 0) canSwapSecond = canSwapSecond && (ar[toSwap - 1] < ar[i]);

          canSwap = canSwapFirst && canSwapSecond;
          if (canSwap) toSwap2 = i;
        }
      }
    }

    if (toSwap == -1 && toSwap2 == -1) {
      return "yes";
    } else if (canSwap) {
      return "swap " + (toSwap + 1) + " " + (toSwap2 + 1);
    } else {
      return "no";
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();

    int[] ar = new int[n];

    for (int i = 0; i < n; ++i) {
      ar[i] = in.nextInt();
    }

    // variables for swap checks
    int toSwap = -1;
    int toSwap2 = -1;
    boolean canSwap = false;
    boolean canSwap2 = false;

    for (int i = 1; i < n; ++i) {
      if (ar[i] < ar[i-1]) {
        // check for swap
        if (canSwap2) {
          canSwap = false;
          break;
        } else if (toSwap == -1) {
          toSwap = i - 1;
          toSwap2 = i;
          canSwap = true;
        } else { // found second out-of-order variable
          canSwap2 = true;

          boolean canSwapFirst = true;
          canSwapFirst = canSwapFirst && (ar[i - 1] < ar[toSwap]);
          if (i != n - 1) canSwapFirst = canSwapFirst && (ar[toSwap] < ar[i + 1]);

          boolean canSwapSecond = true;
          canSwapSecond = canSwapSecond && (ar[i] < ar[toSwap + 1]);
          if (toSwap != 0) canSwapSecond = canSwapSecond && (ar[toSwap - 1] < ar[i]);

          canSwap = canSwapFirst && canSwapSecond;
          if (canSwap) toSwap2 = i;
        }
      }
    }

    if (canSwap) {
      System.out.println("swap " + (toSwap + 1) + " " + (toSwap2 + 1));
    }

  }
}
