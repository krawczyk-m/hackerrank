package sorting.insertion;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class InsertionSortTest {

  @Test
  public void _testInsertionSort() {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    assertEquals(Arrays.asList(), InsertionSort._insertionSort(arr));

    arr.add(1);
    assertEquals(Arrays.asList(1), InsertionSort._insertionSort(arr));

    arr.add(0);
    assertEquals(Arrays.asList(0, 1), InsertionSort._insertionSort(arr));

    arr.add(3);
    arr.add(5);
    arr.add(6);
    arr.add(8);
    arr.add(2);
    assertEquals(Arrays.asList(0, 1, 2, 3, 5, 6, 8), InsertionSort._insertionSort(arr));
  }

  @Test
  public void testInsertionSort() {
    int[] empty = new int[0];
    assertArrayEquals(new int[]{}, InsertionSort.insertionSort(empty));

    int[] one = {5};
    assertArrayEquals(new int[]{5}, InsertionSort.insertionSort(one));

    int[] twoSorted = {5, 10};
    assertArrayEquals(new int[]{5, 10}, InsertionSort.insertionSort(twoSorted));

    int[] twoUnsorted = {555, -4};
    assertArrayEquals(new int[]{-4, 555}, InsertionSort.insertionSort(twoUnsorted));

    int[] multiSorted = {-5, -3, 0, 1, 88, 501, 4444, 12121, 8888888};
    assertArrayEquals(new int[]{-5, -3, 0, 1, 88, 501, 4444, 12121, 8888888}, InsertionSort.insertionSort(multiSorted));

    int[] multiUnsorted = {4, 0, 1, 99, -500, 414, -2, 44, -10101};
    assertArrayEquals(new int[]{-10101, -500, -2, 0, 1, 4, 44, 99, 414}, InsertionSort.insertionSort(multiUnsorted));

    int[] terriblyUnsorted = {101, 44, 12, 4, 0, -3, -6, -99, -1023};
    assertArrayEquals(new int[]{-1023, -99, -6, -3, 0, 4, 12, 44, 101}, InsertionSort.insertionSort(terriblyUnsorted));

  }


}
