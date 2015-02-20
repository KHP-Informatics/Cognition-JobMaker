/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.brc.iop.kcl.ac.uk.crisjobmaker;

import java.io.File;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rjackson
 */
public class XStreamTranslatorTest {
    
    public XStreamTranslatorTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of toXMLString method, of class XStreamTranslator.
     */
    @Test
    public void testToXMLString() {
        System.out.println("toXMLString");
        Object object = null;
        XStreamTranslator instance = null;
        String expResult = "";
        String result = instance.toXMLString(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toObject method, of class XStreamTranslator.
     */
    @Test
    public void testToObject_String() {
        System.out.println("toObject");
        String xml = "";
        XStreamTranslator instance = null;
        Object expResult = null;
        Object result = instance.toObject(xml);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInstance method, of class XStreamTranslator.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        XStreamTranslator expResult = null;
        XStreamTranslator result = XStreamTranslator.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toObject method, of class XStreamTranslator.
     */
    @Test
    public void testToObject_File() throws Exception {
        System.out.println("toObject");
        File xmlFile = null;
        XStreamTranslator instance = null;
        Object expResult = null;
        Object result = instance.toObject(xmlFile);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toXMLFile method, of class XStreamTranslator.
     */
    @Test
    public void testToXMLFile_Object_String() throws Exception {
        System.out.println("toXMLFile");
        Object objTobeXMLTranslated = null;
        String fileName = "";
        XStreamTranslator instance = null;
        instance.toXMLFile(objTobeXMLTranslated, fileName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toXMLFile method, of class XStreamTranslator.
     */
    @Test
    public void testToXMLFile_3args() throws Exception {
        System.out.println("toXMLFile");
        Object objTobeXMLTranslated = null;
        String fileName = "";
        List omitFieldsRegXList = null;
        XStreamTranslator instance = null;
        instance.toXMLFile(objTobeXMLTranslated, fileName, omitFieldsRegXList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of xstreamInitializeSettings method, of class XStreamTranslator.
     */
    @Test
    public void testXstreamInitializeSettings() {
        System.out.println("xstreamInitializeSettings");
        Object objTobeXMLTranslated = null;
        List omitFieldsRegXList = null;
        XStreamTranslator instance = null;
        instance.xstreamInitializeSettings(objTobeXMLTranslated, omitFieldsRegXList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toXMLFile method, of class XStreamTranslator.
     */
    @Test
    public void testToXMLFile_Object() throws Exception {
        System.out.println("toXMLFile");
        Object objTobeXMLTranslated = null;
        XStreamTranslator instance = null;
        instance.toXMLFile(objTobeXMLTranslated);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
