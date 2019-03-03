package za.ac.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import java.util.Arrays;

public class List1Test {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void carL() {
        List1 out = new List1();

        String[] cars = {"Volvo","BMW","Ranger","Mazarati"};

        String outpa = out.CarL();

        Assert.assertEquals(outpa, Arrays.toString(cars));
    }
}