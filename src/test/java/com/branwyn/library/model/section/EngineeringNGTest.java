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
public class EngineeringNGTest {
    
    public EngineeringNGTest() {
    }
    
    @Test
    public void creation() throws Exception{
        Engineering eng = new Engineering.Builder("Engineering basics").id("654654").build();
        Assert.assertEquals(eng.getName(), "Engineering basics");
        Assert.assertEquals(eng.getId(), "654654");
    }
    
    @Test
    public void update() throws Exception{
        Engineering newEng = new Engineering.Builder("Engineering basics").id("852456").build();
        Assert.assertEquals(newEng.getName(), "Engineering basics");
        Assert.assertEquals(newEng.getId(), "852456");
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
