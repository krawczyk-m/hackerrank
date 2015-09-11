package warmup;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class ExtraLongFactorialTest {

    @Test
    public void testFactorial() {
        BigInteger n = BigInteger.ZERO;
        assertEquals(BigInteger.ONE, ExtraLongFactorial.factorial(n));

        n = BigInteger.ONE;
        assertEquals(BigInteger.ONE, ExtraLongFactorial.factorial(n));

        n = BigInteger.valueOf(5l);
        assertEquals(BigInteger.valueOf(120l), ExtraLongFactorial.factorial(n));

        n = BigInteger.valueOf(10l);
        assertEquals(BigInteger.valueOf(3628800l), ExtraLongFactorial.factorial(n));

        n = BigInteger.valueOf(20l);
        assertEquals(BigInteger.valueOf(2432902008176640000l), ExtraLongFactorial.factorial(n));

        n = BigInteger.valueOf(50l);
        assertEquals(new BigInteger("30414093201713378043612608166064768844377641568960512000000000000"), ExtraLongFactorial.factorial(n));

        n = BigInteger.valueOf(100l);
        assertEquals(new BigInteger("93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000"), ExtraLongFactorial.factorial(n));
    }
}
