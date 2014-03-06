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
public class AuthorNGTest {
    
    public AuthorNGTest() {
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

    @Test
    public void creation() throws Exception{
       Author a = new Author.Builder(15).id("2541").firstName("Clive").lastName("Barker").build();
       Assert.assertEquals(a.getNumberOfPublications(),15);
       Assert.assertEquals(a.getId(), "2541");
       Assert.assertEquals(a.getFirstName(), "Clive");
       Assert.assertEquals(a.getLastName(), "Barker");
    }
    
}
