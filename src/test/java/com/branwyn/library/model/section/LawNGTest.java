/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.branwyn.library.model.section;

import org.junit.Assert;
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
public class LawNGTest {
    
    public LawNGTest() {
    }
    
    @Test
    public void creation() throws Exception{
        Law l = new Law.Builder("Criminal minds 101").id("85478").build();
        Assert.assertEquals(l.getName(), "Criminal minds 101");
        Assert.assertEquals(l.getId(), "85478");
    }
    
    @Test
    public void update() throws Exception{
        Law newLaw = new Law.Builder("Introduction to South African Law").id("85478").build();
        Assert.assertEquals(newLaw.getName(), "Introduction to South African Law");
        Assert.assertEquals(newLaw.getId(), "85478");
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
