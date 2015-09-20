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

    int[] thirdToSwap = {1, 9, 3, 4, 2, 5, -1};
    assertEquals("no", AlmostSorted.sortBySwap(thirdToSwap));
  }

  @Test
  public void testReverse() {
    int[] twoSorted = {2, 4};
    assertEquals("yes", AlmostSorted.sortByReverse(twoSorted));

    int[] sorted = {1, 2, 3, 4, 5, 6};
    assertEquals("yes", AlmostSorted.sortByReverse(sorted));

    int[] twoUnsorted = {4, 2};
    assertEquals("reverse 1 2", AlmostSorted.sortByReverse(twoUnsorted));

    int[] beginning = {2, 1, 3, 4, 5};
    assertEquals("reverse 1 2", AlmostSorted.sortByReverse(beginning));

    int[] end = {1, 2, 3, 4, 6, 5};
    assertEquals("reverse 5 6", AlmostSorted.sortByReverse(end));

    int[] middleClose = {10, 22, 44, 31, 56, 67};
    assertEquals("reverse 3 4", AlmostSorted.sortByReverse(middleClose));

    int[] random = {-10, 99, 90, 44, 20, -5, 404, 1001};
    assertEquals("reverse 2 6", AlmostSorted.sortByReverse(random));

    int[] all = {100, 55, 44, 33, 22, 11, -100};
    assertEquals("reverse 1 7", AlmostSorted.sortByReverse(all));

    int[] canNotReverse = {3, 1, 2};
    assertEquals("no", AlmostSorted.sortByReverse(canNotReverse));

    int[] canNotReverse2 = {1, 9, 3, 4};
    assertEquals("no", AlmostSorted.sortByReverse(canNotReverse2));

    int[] canNotReverse3 = {1, 10, 50, 40, 30, 20, 60, 55};
    assertEquals("no", AlmostSorted.sortByReverse(canNotReverse3));
  }
}
