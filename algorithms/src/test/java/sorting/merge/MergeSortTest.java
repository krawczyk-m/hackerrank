package sorting.merge;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest {

  @Test
  public void mergeSortTest() {
    int[] empty = {};
    assertArrayEquals(empty, MergeSort.mergeSort(empty));

    int[] one = {1};
    assertArrayEquals(one, MergeSort.mergeSort(one));

    int[] twoSorted = {1, 2};
    assertArrayEquals(twoSorted, MergeSort.mergeSort(twoSorted));

    int[] twoUnsorted = {2, 1};
    assertArrayEquals(twoUnsorted, MergeSort.mergeSort(twoUnsorted));

    int[] sorted = {-100, -44, 0, 1, 55, 122};
    assertArrayEquals(sorted, MergeSort.mergeSort(sorted));

    int[] unsortedEven = {-55, 412, 51, 0, -22, 40, 10010, -19955, 22};
    assertArrayEquals(new int[] {-19955, -55, -22, 0, 22, 40, 51, 412, 10010}, MergeSort.mergeSort(unsortedEven));

    int[] unsortedOdd = {-55, 412, 51, 0, -22, 40, 10010, -19955};
    assertArrayEquals(new int[] {-19955, -55, -22, 0, 40, 51, 412, 10010}, MergeSort.mergeSort(unsortedOdd));

    int[] reverse = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, MergeSort.mergeSort(reverse));

    int[] same = {1, 1, 1, 1, 1, 1};
    assertArrayEquals(same, MergeSort.mergeSort(same));

    int[] dupes = {-55, 412, 40, 0, -22, 40, -55, -19955};
    assertArrayEquals(new int[] {-19955, -55, -55,  -22, 0, 40, 40, 412}, MergeSort.mergeSort(dupes));
  }
}
