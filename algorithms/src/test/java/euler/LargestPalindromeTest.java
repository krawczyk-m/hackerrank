package euler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestPalindromeTest {

  @Test
  public void testLargestPalindrome() {
    assertEquals(101101, LargestPalindromeProduct.getLargestPalindromeProduct(101110));
    assertEquals(793397, LargestPalindromeProduct.getLargestPalindromeProduct(800000));
  }
}
