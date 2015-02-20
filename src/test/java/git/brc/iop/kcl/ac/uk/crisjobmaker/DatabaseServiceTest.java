/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.brc.iop.kcl.ac.uk.crisjobmaker;

import java.sql.ResultSet;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rjackson
 */
public class DatabaseServiceTest {
    
    public DatabaseServiceTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getResultSet method, of class DatabaseService.
     */
    @Test
    public void testGetResultSet() {
        System.out.println("getResultSet");
        ConfigDAO config = null;
        DatabaseService instance = new DatabaseService();
        ResultSet expResult = null;
        ResultSet result = instance.getResultSet(config);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
