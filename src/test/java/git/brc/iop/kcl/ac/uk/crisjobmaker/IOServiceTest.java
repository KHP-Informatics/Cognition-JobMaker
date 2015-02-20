/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.brc.iop.kcl.ac.uk.crisjobmaker;

import java.io.File;
import org.json.JSONArray;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rjackson
 */
public class IOServiceTest {
    
    public IOServiceTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of loadConfig method, of class IOService.
     */
    @Test
    public void testLoadConfig() {
        System.out.println("loadConfig");
        String configPath = "";
        IOService instance = new IOService();
        ConfigDAO expResult = null;
        ConfigDAO result = instance.loadConfig(configPath);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveJSONArray method, of class IOService.
     */
    @Test
    public void testSaveJSONArray() {
        System.out.println("saveJSONArray");
        JSONArray convert = null;
        ConfigDAO config = null;
        IOService instance = new IOService();
        instance.saveJSONArray(convert, config);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveConfig method, of class IOService.
     */
    @Test
    public void testSaveConfig() {
        System.out.println("saveConfig");
        Object inst = null;
        File file = null;
        IOService instance = new IOService();
        instance.saveConfig(inst, file);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
