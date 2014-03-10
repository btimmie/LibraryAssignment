package com.branwyn.library.model.payment;

import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Branwyn
 */
public class CreditNGTest {
    
    public CreditNGTest() {
    }
    
    @Test
    public void creation() throws Exception{
        Credit c = new Credit.Builder("124").amount(200).build();
        Assert.assertEquals(c.getID(), "124");
        Assert.assertEquals(c.getAmount(), 200);
    }
    
    @Test
    public void update() throws Exception{
        Credit c = new Credit.Builder("124").amount(325).build();
        Assert.assertEquals(c.getAmount(), 325);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    
    
}
