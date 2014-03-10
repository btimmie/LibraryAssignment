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
public class InformationTecnologyNGTest {
    
    public InformationTecnologyNGTest() {
        
    }
    
    @Test
    public void creation() throws Exception{
        InformationTecnology it = new InformationTecnology.Builder("Information Tecnology is the future").id("985").build();
        Assert.assertEquals(it.getName(), "Information Tecnology is the future");
        Assert.assertEquals(it.getId(),"985" );
    }
    
    @Test
    public void update() throws Exception{
        InformationTecnology newIT = new InformationTecnology.Builder("Information Tecnology in business").id("985").build();
        Assert.assertEquals(newIT.getName(), "Information Tecnology in business");
        Assert.assertEquals(newIT.getId(),"985" );
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
