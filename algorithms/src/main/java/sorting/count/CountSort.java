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

//    int[] occurrences = new int[100];
    StringBuilder[] strings = new StringBuilder[100];

    for (int i = 0; i < strings.length; ++i) {
      strings[i] = new StringBuilder("");
    }
    String word = "";
    int num;
    StringBuilder output = new StringBuilder("");

    int half = N/2;

    for (int i = 0; i < half; ++i) {
      num = in.nextInt();
      in.nextLine();
      strings[num].append("- ");
    }

    for (int i = half; i < N; ++i) {
      num = in.nextInt();
      word = in.next() + " ";
      strings[num].append(word);
    }

//    printArray(occurrences);
//    printSorted(occurrences);
//    printCumulative(occurrences);
//    printArray(strings);

    for(int i = 0; i < 100; ++i) {
      output.append(strings[i].toString());
      }

    System.out.print(output.toString());
  }
}
