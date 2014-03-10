package com.branwyn.library.model;

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
public class OrderNGTest {
    
    public OrderNGTest() {
    }
    
    @Test
    public void creation() throws Exception {
        Order o = new Order.Builder("Special").id("6999").build();
        Assert.assertEquals(o.getName(), "Special");
        Assert.assertEquals(o.getId(), "6999");
        
    }
    
    @Test
    public void update() throws Exception {
        Order newO = new Order.Builder("Special").id("852").build();
        Assert.assertEquals(newO.getName(), "Special");
        Assert.assertEquals(newO.getId(), "852");
        
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
