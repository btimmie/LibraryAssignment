/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.branwyn.library.model.section;

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
public class BusinessNGTest {
    
    public BusinessNGTest() {
    }
    
    @Test
    public void creation()throws Exception {
        Business b = new Business.Builder("The world of Business").id("20000").build();
        Assert.assertEquals(b.getName(), "The world of Business");
        Assert.assertEquals(b.getId(), "20000");
    }
    @Test
    public void update()throws Exception {
        Business newB = new Business.Builder("Build you Business successfully").id("20000").build();
        Assert.assertEquals(newB.getName(), "Build you Business successfully");
        Assert.assertEquals(newB.getId(), "20000");
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
