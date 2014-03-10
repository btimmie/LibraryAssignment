/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.branwyn.library.model.books;

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
public class StudyBookNGTest {
    
    public StudyBookNGTest() {
        
    }
    
    @Test
    public void creation() throws Exception{
        StudyBook s = new StudyBook.Builder("0214").name("Advance").build();
        Assert.assertEquals(s.getId(), "0214");
        Assert.assertEquals(s.getName(), "Advance");
    }
    
    @Test
    public void update() throws Exception{
        StudyBook newS = new StudyBook.Builder("0214").name("Normal").build();
        Assert.assertEquals(newS.getId(), "0214");
        Assert.assertEquals(newS.getName(), "Normal");
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
