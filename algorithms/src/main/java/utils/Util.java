package utils;


public class Util {

  public static  void printArray(int[] arr) {
    for (int anArr : arr) {
      System.out.print(anArr + " ");
    }
    System.out.println("");
  }

  public static <T> void printArray(T[] arr) {
    for (T anArr : arr) {
      System.out.print(anArr + " ");
    }
    System.out.println("");
  }
}
