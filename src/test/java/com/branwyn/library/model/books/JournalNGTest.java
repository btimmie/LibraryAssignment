/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.branwyn.library.model.books;

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
public class JournalNGTest {
    
    public JournalNGTest() {
    }
    
    @Test
    public void creation()throws Exception{
        Journal j = new Journal.Builder("222").name("Project Management").build();
        Assert.assertEquals(j.getId(), "222");
        Assert.assertEquals(j.getName(),"Project Management");
    }
    
    @Test
    public void update()throws Exception{
        Journal newJ = new Journal.Builder("222").name("Engineering faults").build();
        Assert.assertEquals(newJ.getName(),"Engineering faults");
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
