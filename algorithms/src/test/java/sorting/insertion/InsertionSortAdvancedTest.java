package sorting.insertion;

import org.junit.Test;
import sorting.merge.MergeSort;

import static org.junit.Assert.assertEquals;

public class InsertionSortAdvancedTest {

  @Test
  public void insertionSortAdvancedTest() {
    int[] empty = {};
    assertEquals(0, MergeSort.mergeSort(empty, true));

    int[] one = {1};
    assertEquals(0, MergeSort.mergeSort(one, true));

    int[] twoSorted = {1, 2};
    assertEquals(0, MergeSort.mergeSort(twoSorted, true));

    int[] twoUnsorted = {2, 1};
    assertEquals(1, MergeSort.mergeSort(twoUnsorted, true));

    int[] sorted = {-100, -44, 0, 1, 55, 122};
    assertEquals(0, MergeSort.mergeSort(sorted, true));

    int[] unsortedEven = {-55, 412, 51, 0, -22, 40, 10010, -19955, 22};
    assertEquals(19, MergeSort.mergeSort(unsortedEven, true));

    int[] unsortedOdd = {-55, 412, 51, 0, -22, 40, 10010, -19955};
    assertEquals(15, MergeSort.mergeSort(unsortedOdd, true));

    int[] reverse = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    assertEquals(36, MergeSort.mergeSort(reverse, true));

    int[] same = {1, 1, 1, 1, 1, 1};
    assertEquals(0, MergeSort.mergeSort(same, true));

    int[] dupes = {-55, 412, 40, 0, -22, 40, -55, -19955};
    assertEquals(19, MergeSort.mergeSort(dupes, true));
  }
}
