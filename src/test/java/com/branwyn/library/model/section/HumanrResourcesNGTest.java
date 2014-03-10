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
public class HumanrResourcesNGTest {

    public HumanrResourcesNGTest() {
    }

    @Test
    public void creation() throws Exception {
        HumanrResources hr = new HumanrResources.Builder("Advance HR").id("21410").build();
        Assert.assertEquals(hr.getName(), "Advance HR");
        Assert.assertEquals(hr.getId(), "21410");
    }

    @Test
    public void update() throws Exception {
        HumanrResources newHR = new HumanrResources.Builder("Advance HR").id("2541").build();
        Assert.assertEquals(newHR.getName(), "Advance HR");
        Assert.assertEquals(newHR.getId(), "2541");
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
