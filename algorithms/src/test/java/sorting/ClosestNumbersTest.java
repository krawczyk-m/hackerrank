package sorting;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class ClosestNumbersTest {

  private static final int N = 200000;

  private static int[] getBigArray() {
    int[] arr = new int[N];

    for (int i = 0; i < N; ++i) {
      arr[i] = i;
    }

    return shuffle(arr);
  }

  private static int[] shuffle(int[] arr) {
    int iterations = 200000;
    Random rnd = new Random();

    for (int i = 0; i < iterations; ++i) {
      int idx = rnd.nextInt(arr.length);
      int idx2 = rnd.nextInt(arr.length);

      int tmp = arr[idx];
      arr[idx] = arr[idx2];
      arr[idx2] = tmp;
    }

    return arr;
  }

  private String getResult() {
    StringBuilder res = new StringBuilder("");
    res.append("0");

    for (int i = 1; i < N - 1; ++i) {
      res.append(" " + i);
      res.append(" " + i);
    }

    res.append(" " + (N -1));
    return res.toString();
  }

  @Test
  public void testClosestNumbers() {
    int[] onePair = {200, 100, 1000, -5, -20, 44, -515, 888, 0};
    assertEquals("-5 0", ClosestNumbers.closestNumbers(onePair));

    int[] multiplePairs = {100, -5, -444, 20, -133, -30, 45};
    assertEquals("-30 -5 -5 20 20 45", ClosestNumbers.closestNumbers(multiplePairs));

    assertEquals(getResult(), ClosestNumbers.closestNumbers(getBigArray()));
  }

  @Test(expected = AssertionError.class)
  public void testMinimumArraySize() {
    int[] one = {2};
    ClosestNumbers.closestNumbers(one);
  }
}
