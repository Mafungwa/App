package za.ac.cput.demoaaa;

import org.junit.Assert;
import org.junit.Test;

public class ImpInterTest {

    @Test
    public void comeModel() {
        ImpInter objIntr = new ImpInter() ;
        Assert.assertEquals("Kia",objIntr.comeModel());

    }
}