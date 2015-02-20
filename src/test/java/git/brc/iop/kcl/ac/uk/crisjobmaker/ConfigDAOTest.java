/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.brc.iop.kcl.ac.uk.crisjobmaker;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rjackson
 */
public class ConfigDAOTest {
    
    public ConfigDAOTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getJDBCString method, of class ConfigDAO.
     */
    @Test
    public void testGetJDBCString() {
        System.out.println("getJDBCString");
        ConfigDAO instance = new ConfigDAO();
        String expResult = "";
        String result = instance.getJDBCString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJDBCString method, of class ConfigDAO.
     */
    @Test
    public void testSetJDBCString() {
        System.out.println("setJDBCString");
        String JDBCString = "";
        ConfigDAO instance = new ConfigDAO();
        instance.setJDBCString(JDBCString);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserName method, of class ConfigDAO.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName");
        String UserName = "";
        ConfigDAO instance = new ConfigDAO();
        instance.setUserName(UserName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class ConfigDAO.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String Password = "";
        ConfigDAO instance = new ConfigDAO();
        instance.setPassword(Password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuery method, of class ConfigDAO.
     */
    @Test
    public void testSetQuery() {
        System.out.println("setQuery");
        String query = "";
        ConfigDAO instance = new ConfigDAO();
        instance.setQuery(query);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOutputPath method, of class ConfigDAO.
     */
    @Test
    public void testSetOutputPath() {
        System.out.println("setOutputPath");
        String outputPath = "";
        ConfigDAO instance = new ConfigDAO();
        instance.setOutputPath(outputPath);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserName method, of class ConfigDAO.
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        ConfigDAO instance = new ConfigDAO();
        String expResult = "";
        String result = instance.getUserName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class ConfigDAO.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        ConfigDAO instance = new ConfigDAO();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuery method, of class ConfigDAO.
     */
    @Test
    public void testGetQuery() {
        System.out.println("getQuery");
        ConfigDAO instance = new ConfigDAO();
        String expResult = "";
        String result = instance.getQuery();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOutputPath method, of class ConfigDAO.
     */
    @Test
    public void testGetOutputPath() {
        System.out.println("getOutputPath");
        ConfigDAO instance = new ConfigDAO();
        String expResult = "";
        String result = instance.getOutputPath();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
