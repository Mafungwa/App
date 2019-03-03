package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ImpInterTest {

    @Test
    public void comeModel() {
        ImpInter objIntr = new ImpInter() ;
        Assert.assertEquals("Kia",objIntr.comeModel());

    }
}