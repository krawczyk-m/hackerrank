package sorting;

import java.util.Scanner;

public class AlmostSorted {

  public static String sortBySwap(int[] ar) {
    // variables for swap checks
    int toSwap = -1;
    int toSwap2 = -1;
    boolean canSwap = true;

    int n = ar.length;
    int i = 0;

    while(++i < n && ar[i - 1] < ar[i]) {} // search for out-of-order value
    if (i != n) { // found out-of-order value
      toSwap = i - 1;

      while (++i < n && ar[i - 1] < ar[i]) {} // search for another out-of-order
      if (i != n) { // found another out-of-order
        toSwap2 = i;

        while (++i < n && ar[i - 1] < ar[i]) {} // search for another out-of-order
        if (i != n) { // found another out-of-order - cannot swap
          return "no";
        }
      } else { // i == n
        toSwap2 = toSwap + 1; // must swap the first out-of-order value found with the following one
      }
    } else { // i == n -> in order
      return "yes";
    }

    if (toSwap < toSwap2 - 1) canSwap = canSwap && (ar[toSwap2 - 1] < ar[toSwap]);
    if (toSwap2 < n - 1) canSwap = canSwap && (ar[toSwap] < ar[toSwap2 + 1]);

    if (toSwap < toSwap2 - 1) canSwap = canSwap && (ar[toSwap2] < ar[toSwap + 1]);
    if (toSwap != 0) canSwap = canSwap && (ar[toSwap - 1] < ar[toSwap2]);

    if (canSwap) {
      return "swap " + (toSwap + 1) + " " + (toSwap2 + 1);
    } else {
      return "no";
    }
  }

  public static String sortByReverse(int[] ar) {
    int reverseStart = -1;
    int reverseEnd = -1;
    boolean canReverse = true;

    int n = ar.length;
    int i = 0;

    while (++i < n && ar[i - 1] < ar[i]) {} // search for out-of-order value
    if (i != n) { // found out-of-order value
      reverseStart = i - 1;

      while (++i < n && ar[i - 1] > ar[i]) {} // search of end of descending sequence
      if (i != n) { // found end
        reverseEnd = i - 1;

        while (++i < n && ar[i - 1] < ar[i]) {} // search for another out-of-order value
        if (i != n) { // out of order found - can not reverse
          return "no";
        }
      } else {
        reverseEnd = n - 1;
      }
    } else { // i == n -> in order
      return "yes";
    }

    if (reverseStart != 0) canReverse = canReverse && ar[reverseStart - 1] < ar[reverseEnd];
    if (reverseEnd != n - 1) canReverse = canReverse && ar[reverseStart] < ar[reverseEnd + 1];

    if (canReverse) {
      return "reverse " + (reverseStart + 1) + " " + (reverseEnd + 1);
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

    String swap = sortBySwap(ar);
    String rev = sortByReverse(ar);
    if (swap.contains("swap")) {
      System.out.println("yes\n" + swap);
    } else if (rev.contains("reverse")) {
        System.out.println("yes\n" + rev);
    } else {
      System.out.println("no");
    }
  }
}
