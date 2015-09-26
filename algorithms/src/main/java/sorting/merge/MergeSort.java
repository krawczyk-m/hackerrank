package sorting.merge;

public class MergeSort {

  public static int[] mergeSort(int[] arr) {
    mergeSort(arr, 0, arr.length - 1);
    return arr;
  }

  private static void mergeSort(int[] arr, int p, int q) {
    if (q - p + 1 > 1) { // q - p + 1 - number of elements to sort
      int r = (int) Math.floor((p + q) / 2);
      mergeSort(arr, p, r);
      mergeSort(arr, r + 1, q);
      merge(arr, p, r, q);
    }
  }

  private static void merge(int[] arr, int p, int r, int q) {
    int len = q - p + 1;
    int[] tmp = new int[len];

    int i = p;
    int j = r + 1;

    for (int t = 0; t < len;) {
      if (i < r + 1 && (j > q || arr[i] < arr[j])) {
        tmp[t++] = arr[i++];
      } else {
        tmp[t++] = arr[j++];
      }
    }

    copyArray(tmp, arr, p);
  }

  private static void copyArray(int[] source, int[] dest, int startIndex) {
    int len = source.length;

    for (int i = startIndex; i < startIndex + len; ++i) {
      dest[i] = source[i - startIndex];
    }
  }
}
