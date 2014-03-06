/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.branwyn.library.model;

import java.util.List;
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
public class BookNGTest {

    public BookNGTest() {
    }
    @Test
    public void creation() throws Exception{
       Book b = new Book.Builder("Harry Potter and the chamber of secrets").id("123").publicationYear(2010).build();
       Assert.assertEquals(b.getTitle(), "Harry Potter and the chamber of secrets");
       Assert.assertEquals(b.getId(), "123");
       Assert.assertEquals(b.getPublicationYear(), 2010);
             
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

    /**
     * Test of getId method, of class Book.
     */
    /*@Test
     public void testGetId() {
     System.out.println("getId");
     Book instance = null;
     String expResult = "";
     String result = instance.getId();
     assertEquals(result, expResult);
     // TODO review the generated test code and remove the default call to fail.
     fail("The test case is a prototype.");
     }

     /**
     * Test of getTitle method, of class Book.
     */
    /*@Test
     public void testGetTitle() {
     System.out.println("getTitle");
     Book instance = null;
     String expResult = "";
     String result = instance.getTitle();
     assertEquals(result, expResult);
     // TODO review the generated test code and remove the default call to fail.
     fail("The test case is a prototype.");
     }

     /**
     * Test of getPublicationYear method, of class Book.
     */
    /*@Test
     public void testGetPublicationYear() {
     System.out.println("getPublicationYear");
     Book instance = null;
     int expResult = 0;
     int result = instance.getPublicationYear();
     assertEquals(result, expResult);
     // TODO review the generated test code and remove the default call to fail.
     fail("The test case is a prototype.");
     }

     /**
     * Test of getSupplier method, of class Book.
     */
    /*@Test
     public void testGetSupplier() {
     System.out.println("getSupplier");
     Book instance = null;
     List expResult = null;
     List result = instance.getSupplier();
     assertEquals(result, expResult);
     // TODO review the generated test code and remove the default call to fail.
     fail("The test case is a prototype.");
     }

     /**
     * Test of getAuthors method, of class Book.
     */
    /*@Test
     public void testGetAuthors() {
     System.out.println("getAuthors");
     Book instance = null;
     List expResult = null;
     List result = instance.getAuthors();
     assertEquals(result, expResult);
     // TODO review the generated test code and remove the default call to fail.
     fail("The test case is a prototype.");
     }

     /**
     * Test of hashCode method, of class Book.
     */
    /*@Test
     public void testHashCode() {
     System.out.println("hashCode");
     Book instance = null;
     int expResult = 0;
     int result = instance.hashCode();
     assertEquals(result, expResult);
     // TODO review the generated test code and remove the default call to fail.
     fail("The test case is a prototype.");
     }

     /**
     * Test of equals method, of class Book.
     */
    /*@Test
     public void testEquals() {
     System.out.println("equals");
     Object obj = null;
     Book instance = null;
     boolean expResult = false;
     boolean result = instance.equals(obj);
     assertEquals(result, expResult);
     // TODO review the generated test code and remove the default call to fail.
     fail("The test case is a prototype.");
     }*/
}
