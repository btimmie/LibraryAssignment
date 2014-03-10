/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class ChequeNGTest {
    
    public ChequeNGTest() {
    }
    @Test
    public void creation() throws Exception{
        Cheque c = new Cheque.Builder("5478").amount(524).build();
        Assert.assertEquals(c.getID(), "5478");
        Assert.assertEquals(c.getAmount(), 524);
    }
    
    @Test
    public void update() throws Exception{
         Cheque newC = new Cheque.Builder("5478").amount(588).build();
         Assert.assertEquals(newC.getAmount(), 588);
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