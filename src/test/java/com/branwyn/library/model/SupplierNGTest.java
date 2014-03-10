package com.branwyn.library.model;

import java.util.List;
import junit.framework.Assert;
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
public class SupplierNGTest {

    public SupplierNGTest() {
    }

    @Test
    public void creation() throws Exception {
        Supplier s = new Supplier.Builder("200").name("Bright minds").build();
        Assert.assertEquals(s.getId(), "200");
        Assert.assertEquals(s.getName(), "Bright minds");
    }

    @Test
    public void update() throws Exception {
        Supplier newS = new Supplier.Builder("200").name("Trinity praise books").build();
        Assert.assertEquals(newS.getId(), "200");
        Assert.assertEquals(newS.getName(), "Trinity praise books");
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
