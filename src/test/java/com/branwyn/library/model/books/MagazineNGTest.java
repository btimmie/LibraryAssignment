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
public class MagazineNGTest {

    public MagazineNGTest() {
    }

    @Test
    public void creation() throws Exception {
        Magazine m = new Magazine.Builder("999").name("YOU").build();
        Assert.assertEquals(m.getId(), "999");
        Assert.assertEquals(m.getName(), "YOU");
    }

    @Test
    public void update() throws Exception {
        Magazine newM = new Magazine.Builder("999").name("Huis genoot").build();
        Assert.assertEquals(newM.getName(), "Huis genoot");
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
