package sorting.quick;


import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class QuickSortTest {

  @Test
  public void partitionTest() {
    int[] empty = {};
    assertArrayEquals(empty, QuickSort.partition(empty));

    int[] one = {1};
    assertArrayEquals(one, QuickSort.partition(one));

    int[] twoPartitioned = {-2, 5};
    assertArrayEquals(twoPartitioned, QuickSort.partition(twoPartitioned));

    int[] twoUnpartitioned = {7, 3};
    assertArrayEquals(twoUnpartitioned, QuickSort.partition(twoUnpartitioned));

    int[] unpartitioned = {4, 5, 3, 7, 2};
    assertArrayEquals(new int[]{3, 2, 4, 5, 7}, QuickSort.partition(unpartitioned));

    int[] unpartitioned2 = {-4, 1, 5, -5, 2, -7};
    assertArrayEquals(new int[]{-5, -7, -4, 1, 5, 2}, QuickSort.partition(unpartitioned2));
  }
}
