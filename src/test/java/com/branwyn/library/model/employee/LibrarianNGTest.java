/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.branwyn.library.model.employee;

import java.util.List;
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
public class LibrarianNGTest {
    
    public LibrarianNGTest() {
    }
    
    @Test
    public void creation() throws Exception{
        Librarian l = new Librarian.Builder("22201").name("Paul").build();
        Assert.assertEquals(l.getId(), "22201");
        Assert.assertEquals(l.getName(), "Paul");
    }
    
    @Test
    public void update() throws Exception{
        Librarian newL = new Librarian.Builder("5").name("Paul").build();
        Assert.assertEquals(newL.getId(), "5");
        Assert.assertEquals(newL.getName(), "Paul");
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
