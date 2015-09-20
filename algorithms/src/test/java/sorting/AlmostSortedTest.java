package sorting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlmostSortedTest {

  @Test
  public void testSwap() {
    int[] twoSorted = {2, 4};
    assertEquals("yes", AlmostSorted.sortBySwap(twoSorted));

    int[] sorted = {1, 2, 3, 4, 5, 6};
    assertEquals("yes", AlmostSorted.sortBySwap(sorted));

    int[] twoUnsorted = {4, 2};
    assertEquals("swap 1 2", AlmostSorted.sortBySwap(twoUnsorted));

    int[] beginning = {2, 1, 3, 4, 5};
    assertEquals("swap 1 2", AlmostSorted.sortBySwap(beginning));

    int[] end = {1, 2, 3, 4, 6, 5};
    assertEquals("swap 5 6", AlmostSorted.sortBySwap(end));

    int[] middleClose = {10, 22, 44, 31, 56, 67};
    assertEquals("swap 3 4", AlmostSorted.sortBySwap(middleClose));

    int[] random = {-10, 99, 20, 44, 90, -5, 404, 1001};
    assertEquals("swap 2 6", AlmostSorted.sortBySwap(random));

    int[] firstAndLast = {100, 11, 22, 33, 44, 55, -100};
    assertEquals("swap 1 7", AlmostSorted.sortBySwap(firstAndLast));

    int[] canNotSwap = {3, 1, 2};
    assertEquals("no", AlmostSorted.sortBySwap(canNotSwap));

    int[] canNotSwap2 = {1, 9, 3, 4};
    assertEquals("no", AlmostSorted.sortBySwap(canNotSwap2));
  }
}
