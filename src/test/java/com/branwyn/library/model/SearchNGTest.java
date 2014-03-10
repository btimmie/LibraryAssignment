/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.branwyn.library.model;

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
public class SearchNGTest {
    
    public SearchNGTest() {
    }
    @Test
    public void creation() throws Exception {
        Search s = new Search.Builder("5454").bookName("How to build a house").build();
        Assert.assertEquals(s.getId(), "5454");
        Assert.assertEquals(s.getBookName(), "How to build a house");
    }
    
     @Test
    public void update() throws Exception {
        Search newS = new Search.Builder("5454").bookName("How to build a car").build();
        Assert.assertEquals(newS.getId(), "5454");
        Assert.assertEquals(newS.getBookName(), "How to build a car");
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
