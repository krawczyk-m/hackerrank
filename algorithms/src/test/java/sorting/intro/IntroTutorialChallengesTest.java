package sorting.intro;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntroTutorialChallengesTest {

    private static final int empty[] = new int[0];
    private static final int one[] = {10};
    private static final int two[] = {5, 100};
    private static final int three[] = {50, 77, 123};
    private static final int odd[] = {2, 99 , 771, 4123, 102304, 515799, 515987578};
    private static final int even[] = {8, 12, 595, 1255, 18859, 123452, 5551120, 65486909};

    @Test
    public void testEmpty() {
        assertEquals(-1, IntroTutorialChallenges.linearSearch(empty, 14));
        assertEquals(-1, IntroTutorialChallenges.binarySearch(empty, 14));
    }

    @Test
    public void testOne() {
        assertEquals(0, IntroTutorialChallenges.linearSearch(one, 10));
        assertEquals(0, IntroTutorialChallenges.binarySearch(one, 10));
    }

    @Test
    public void testTwo() {
        assertEquals(0, IntroTutorialChallenges.linearSearch(two, 5));
        assertEquals(0, IntroTutorialChallenges.binarySearch(two, 5));

        assertEquals(1, IntroTutorialChallenges.linearSearch(two, 100));
        assertEquals(1, IntroTutorialChallenges.binarySearch(two, 100));
    }

    @Test
    public void testThree() {
        assertEquals(0, IntroTutorialChallenges.linearSearch(three, 50));
        assertEquals(0, IntroTutorialChallenges.binarySearch(three, 50));

        assertEquals(1, IntroTutorialChallenges.linearSearch(three, 77));
        assertEquals(1, IntroTutorialChallenges.binarySearch(three, 77));

        assertEquals(2, IntroTutorialChallenges.linearSearch(three, 123));
        assertEquals(2, IntroTutorialChallenges.binarySearch(three, 123));
    }

    @Test
    public void testOdd() {
        assertEquals(0, IntroTutorialChallenges.linearSearch(odd, 2));
        assertEquals(0, IntroTutorialChallenges.binarySearch(odd, 2));

        assertEquals(1, IntroTutorialChallenges.linearSearch(odd, 99));
        assertEquals(1, IntroTutorialChallenges.binarySearch(odd, 99));

        assertEquals(2, IntroTutorialChallenges.linearSearch(odd, 771));
        assertEquals(2, IntroTutorialChallenges.binarySearch(odd, 771));

        assertEquals(3, IntroTutorialChallenges.linearSearch(odd, 4123));
        assertEquals(3, IntroTutorialChallenges.binarySearch(odd, 4123));

        assertEquals(4, IntroTutorialChallenges.linearSearch(odd, 102304));
        assertEquals(4, IntroTutorialChallenges.binarySearch(odd, 102304));

        assertEquals(5, IntroTutorialChallenges.linearSearch(odd, 515799));
        assertEquals(5, IntroTutorialChallenges.binarySearch(odd, 515799));

        assertEquals(6, IntroTutorialChallenges.linearSearch(odd, 515987578));
        assertEquals(6, IntroTutorialChallenges.binarySearch(odd, 515987578));
    }

    @Test
    public void testEven() {
        assertEquals(0, IntroTutorialChallenges.linearSearch(even, 8));
        assertEquals(0, IntroTutorialChallenges.binarySearch(even, 8));

        assertEquals(1, IntroTutorialChallenges.linearSearch(even, 12));
        assertEquals(1, IntroTutorialChallenges.binarySearch(even, 12));

        assertEquals(2, IntroTutorialChallenges.linearSearch(even, 595));
        assertEquals(2, IntroTutorialChallenges.binarySearch(even, 595));

        assertEquals(3, IntroTutorialChallenges.linearSearch(even, 1255));
        assertEquals(3, IntroTutorialChallenges.binarySearch(even, 1255));

        assertEquals(4, IntroTutorialChallenges.linearSearch(even, 18859));
        assertEquals(4, IntroTutorialChallenges.binarySearch(even, 18859));

        assertEquals(5, IntroTutorialChallenges.linearSearch(even, 123452));
        assertEquals(5, IntroTutorialChallenges.binarySearch(even, 123452));

        assertEquals(6, IntroTutorialChallenges.linearSearch(even, 5551120));
        assertEquals(6, IntroTutorialChallenges.binarySearch(even, 5551120));

        assertEquals(7, IntroTutorialChallenges.linearSearch(even, 65486909));
        assertEquals(7, IntroTutorialChallenges.binarySearch(even, 65486909));
    }
}
