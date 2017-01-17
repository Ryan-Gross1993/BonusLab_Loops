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
}
