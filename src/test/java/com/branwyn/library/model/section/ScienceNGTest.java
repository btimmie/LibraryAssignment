package com.branwyn.library.model.section;

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
public class ScienceNGTest {
    
    public ScienceNGTest() {
    }
    
    @Test
    public void creation() throws Exception{
        Science scn = new Science.Builder("Woman in Science").id("4777").build();
        Assert.assertEquals(scn.getName(), "Woman in Science");
        Assert.assertEquals(scn.getId(),"4777");
    }
    
    @Test
    public void update() throws Exception{
        Science newScn = new Science.Builder("Science Innovations").id("4777").build();
        Assert.assertEquals(newScn.getName(), "Science Innovations");
        Assert.assertEquals(newScn.getId(),"4777");
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
