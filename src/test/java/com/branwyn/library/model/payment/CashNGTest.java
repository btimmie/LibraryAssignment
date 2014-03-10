/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.branwyn.library.model.payment;

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
public class CashNGTest {
    
    public CashNGTest() {
    }
    
    @Test
    public void creation() throws Exception{
        Cash c = new Cash.Builder("654").amount(100).build();
        Assert.assertEquals(c.getID(), "654");
        Assert.assertEquals(c.getAmount(), 100);
    }
    
    @Test
    public void update() throws Exception{
        Cash newC = new Cash.Builder("654").amount(100).build();
        Assert.assertEquals(newC.getAmount(), 100);
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
