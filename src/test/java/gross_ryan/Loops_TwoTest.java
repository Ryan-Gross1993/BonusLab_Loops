package gross_ryan;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ryangross on 1/16/17.
 */
public class Loops_TwoTest {

    Loops_Two test;

    @Before
    public void setUp() {
        test = new Loops_Two();
    }

    @Test
    public void oneToTenTest() {
        String expected = "oneToTen()\n" +
                "*** Output ***\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n" +
                "6\n" +
                "7\n" +
                "8\n" +
                "9\n" +
                "10\n";
        Assert.assertEquals(expected, test.oneToTen());
    }

    @Test
    public void oddNumbersTest() {
        String expected = "oddNumbers()\n" +
                "*** Output ***\n" +
                "1\n" +
                "3\n" +
                "5\n" +
                "7\n" +
                "9\n" +
                "11\n" +
                "13\n" +
                "15\n" +
                "17\n" +
                "19\n";
        Assert.assertEquals(expected, test.oddNumbers());
    }

    @Test
    public void squaresTest() {
        String expected = "squares()\n" +
                "*** Output ***\n" +
                "1\n" +
                "4\n" +
                "9\n" +
                "16\n" +
                "25\n" +
                "36\n" +
                "49\n" +
                "64\n" +
                "81\n" +
                "100\n";
        Assert.assertEquals(expected, test.squares());
    }

    @Test
    public void evenTest() {
        String expected = "even10()\n" +
                "*** Output ***\n" +
                "2\n" +
                "4\n" +
                "6\n" +
                "8\n";
        Assert.assertEquals(expected, test.even(10));
    }

    @Test
    public void powersTest() {
        String expected = "*** Output ***\n" +
                "2\n" +
                "4\n" +
                "8\n" +
                "16\n" +
                "32\n" +
                "64\n" +
                "128\n" +
                "256\n";
        Assert.assertEquals(expected, test.powers(8));
    }
}
