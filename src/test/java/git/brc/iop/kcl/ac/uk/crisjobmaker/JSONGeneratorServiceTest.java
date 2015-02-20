/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.brc.iop.kcl.ac.uk.crisjobmaker;

import java.sql.ResultSet;
import org.json.JSONArray;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rjackson
 */
public class JSONGeneratorServiceTest {
    
    public JSONGeneratorServiceTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of convert method, of class JSONGeneratorService.
     */
    @Test
    public void testConvert() {
        System.out.println("convert");
        ResultSet rs = null;
        JSONArray expResult = null;
        JSONArray result = JSONGeneratorService.convert(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
