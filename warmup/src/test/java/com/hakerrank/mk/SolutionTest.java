package com.hakerrank.mk;

import com.hackerrank.mk.Solution;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testSum() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        assertEquals(Solution.sum(list), 0);

        list.add(5);
        assertEquals(Solution.sum(list), 5);

        list.add(-5);
        assertEquals(Solution.sum(list), 0);

        list.add(2);
        list.add(5);
        list.add(100);
        assertEquals(Solution.sum(list), 107);
    }
}
