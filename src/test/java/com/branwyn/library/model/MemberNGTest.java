/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.branwyn.library.model;

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
public class MemberNGTest {

    public MemberNGTest() {
    }

    @Test
    public void creation() throws Exception {
        Member m = new Member.Builder("Branwyn").lastName("Timmie").id("1254").age(20).build();
        Assert.assertEquals(m.getFirstName(), "Branwyn");
        Assert.assertEquals(m.getLastName(), "Timmie");
        Assert.assertEquals(m.getId(), "1254");
        Assert.assertEquals(m.getAge(), 20);
    }

    @Test
    public void update() throws Exception {
        Member newM = new Member.Builder("Frank").lastName("Lampard").id("1254").age(35).build();
        Assert.assertEquals(newM.getFirstName(), "Frank");
        Assert.assertEquals(newM.getLastName(), "Lampard");
        Assert.assertEquals(newM.getAge(), 35);
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
