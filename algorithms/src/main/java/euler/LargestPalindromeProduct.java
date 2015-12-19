package euler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LargestPalindromeProduct {

  private static ArrayList<Integer> palindromes = null;

  private static ArrayList<Integer> getPalindromes() {
    if (palindromes == null) {
      initPalindromes();
    }
    return palindromes;
  }

  private static void initPalindromes() {
    palindromes = new ArrayList<>();
    for (int i = 100; i < 1000; ++i) {
      for (int j = 100; j < 1000; ++j) {
        int palindromeCandidate = i * j;
    if (isPalindrome(palindromeCandidate)) {
          palindromes.add(palindromeCandidate);
        }
      }
    }
  }

  private static boolean isPalindrome(int palindromeCandidate) {
    String s = Integer.toString(palindromeCandidate);
    if (s.length() % 2 == 0) {
      return s.substring(0, 3).equals(new StringBuilder(s.substring(3, 6)).reverse().toString());
    }
    return false;
  }

  public static int getLargestPalindromeProduct(int n) {
    ArrayList<Integer> palindromes = getPalindromes();

    List<Integer> sortedAndLower = palindromes.stream().filter(x -> x < n).sorted().collect(Collectors.toList());

    return sortedAndLower.get(sortedAndLower.size() - 1);
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int T = in.nextInt();

    for (int t = 0; t < T; ++t) {
      int N = in.nextInt();

      System.out.println(getLargestPalindromeProduct(N));
    }
  }
}
