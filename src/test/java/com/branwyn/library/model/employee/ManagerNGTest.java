
package com.branwyn.library.model.employee;

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
public class ManagerNGTest {
    
    public ManagerNGTest() {
    }
    
    @Test
    public void creation() throws Exception{
        Manager manager = new Manager.Builder("90321").name("Hilary").build();
        Assert.assertEquals(manager.getId(), "90321");
        Assert.assertEquals(manager.getName(), "Hilary");
    }
    
    @Test
    public void update() throws Exception{
        Manager newNanager = new Manager.Builder("90321").name("Roderick").build();
        Assert.assertEquals(newNanager.getId(), "90321");
        Assert.assertEquals(newNanager.getName(), "Roderick");
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
