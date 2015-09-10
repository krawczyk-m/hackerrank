package com.hakerrank.mk;

import com.hackerrank.mk.DiagonalDifference;
import com.hackerrank.mk.exceptions.MissingArgumentException;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class DiagonalDifferenceTest {

    @Test
    public void testNegative() throws MissingArgumentException {

        String input = new StringBuilder().
                append("-1\n").
                append("1 2 3\n").
                append("2 3 4\n").
                append("4 5 6\n").toString();

        Scanner scanner = new Scanner(input);

        assertEquals(0, DiagonalDifference.diagDiff(scanner));
    }

    @Test
    public void testZero() throws MissingArgumentException {

        String input = new StringBuilder().
                append("0\n").
                append("1 2 3\n").
                append("2 3 4\n").
                append("4 5 6\n").toString();

        Scanner scanner = new Scanner(input);

        assertEquals(0, DiagonalDifference.diagDiff(scanner));
    }

    @Test
    public void testOne() throws MissingArgumentException {

        String input = new StringBuilder().
                append("1\n").
                append("1").toString();

        Scanner scanner = new Scanner(input);

        assertEquals(0, DiagonalDifference.diagDiff(scanner));
    }

    @Test
    public void testMultiple() throws MissingArgumentException {

        String input = new StringBuilder().
                append("3\n").
                append("1 2 3\n").
                append("2 3 4\n").
                append("4 5 \n").toString();

        Scanner scanner = new Scanner(input);

        assertEquals(0, DiagonalDifference.diagDiff(scanner));
    }

    @Test(expected = MissingArgumentException.class)
    public void testInvalidNumberOfArguments() throws MissingArgumentException {

        String input = new StringBuilder().
                append("3\n").
                append("1 2 3\n").
                append("2 4\n").
                append("4 5 4\n").toString();

        Scanner scanner = new Scanner(input);

        DiagonalDifference.diagDiff(scanner);
    }
}
