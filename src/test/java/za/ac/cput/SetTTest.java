package za.ac.cput;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class SetTTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void setM() {

        SetT subSet = new SetT();
        String subSetOutput =  subSet.setM("Ranger ",300," 120V");
            String iExpected= "Ranger 300 120V";
        Assert.assertEquals(iExpected, subSetOutput);


    }
}