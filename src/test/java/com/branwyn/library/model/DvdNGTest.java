/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class DvdNGTest {
    
    public DvdNGTest() {
    }

    @Test
    public void creation() throws Exception{
        Dvd dvd = new Dvd.Builder().id("585").title("The Expendables 2").releaseDate("17 August 2012").build();
        Assert.assertEquals(dvd.getId(), "585");
        Assert.assertEquals(dvd.getTitle(), "The Expendables 2");
        Assert.assertEquals(dvd.getReleaseDate(), "17 August 2012");
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
