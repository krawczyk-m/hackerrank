package warmup;

import org.junit.Test;
import warmup.exceptions.MissingArgumentException;

import java.util.Arrays;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;


public class PlusMinusTest {

  @Test(expected = IllegalArgumentException.class)
  public void testNegative() throws MissingArgumentException {

    String input = new StringBuilder().
        append("-1\n").
        append("1 2 3\n").toString();

    Scanner scanner = new Scanner(input);

    PlusMinus.plusMinus(scanner);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testZero() throws MissingArgumentException {

    String input = new StringBuilder().
        append("0\n").
        append("1 2 3\n").toString();

    Scanner scanner = new Scanner(input);

    PlusMinus.plusMinus(scanner);
  }

  @Test(expected = MissingArgumentException.class)
  public void invalidNumberOfArguments() throws MissingArgumentException {

    String input = new StringBuilder().
        append("4\n").
        append("1 2 3\n").toString();

    Scanner scanner = new Scanner(input);

    PlusMinus.plusMinus(scanner);
  }

  @Test
  public void properlyCalculatesFractions() throws MissingArgumentException {

    String input = new StringBuilder().
        append("6\n").
        append("-4 3 -9 0 4 1\n").toString();

    Scanner scanner = new Scanner(input);

    assertEquals(
        Arrays.asList((Float) 1f / 2f,
            (Float) 1f / 3f,
            (Float) 1f / 6f),
        PlusMinus.plusMinus(scanner)
    );
  }
}
