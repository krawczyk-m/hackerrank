package sorting.quick;


import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class QuickSortTest {

  @Test
  public void quicksortTest() {
    int[] empty = {};
    assertArrayEquals(empty, QuickSort.quickSort(empty));

    int[] one = {1};
    assertArrayEquals(one, QuickSort.quickSort(one));

    int[] twoSorted = {-2, 5};
    assertArrayEquals(twoSorted, QuickSort.quickSort(twoSorted));

    int[] twoUnsorted = {7, 3};
    assertArrayEquals(new int[]{3, 7}, QuickSort.quickSort(twoUnsorted));

    int[] sorted = {-2414, -100, -8, 1, 2, 3, 4, 5, 77, 500};
    assertArrayEquals(new int[]{-2414, -100, -8, 1, 2, 3, 4, 5, 77, 500}, QuickSort.quickSort(sorted));

    int[] unsorted = {4, 5, -8, 1, -100, -2414, 3, 7, 500, 2};
    assertArrayEquals(new int[]{-2414, -100, -8, 1, 2, 3, 4, 5, 7, 500}, QuickSort.quickSort(unsorted));

    int[] unsorted2 = {-4, 1, 5, -5, 2, -7, 500, -400, -222, 44};
    assertArrayEquals(new int[]{-400, -222, -7, -5, -4, 1, 2, 5, 44, 500}, QuickSort.quickSort(unsorted2));
  }
}
