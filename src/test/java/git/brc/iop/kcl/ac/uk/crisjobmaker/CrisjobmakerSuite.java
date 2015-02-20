/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.brc.iop.kcl.ac.uk.crisjobmaker;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author rjackson
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({git.brc.iop.kcl.ac.uk.crisjobmaker.MainTest.class, git.brc.iop.kcl.ac.uk.crisjobmaker.IOServiceTest.class, git.brc.iop.kcl.ac.uk.crisjobmaker.ConfigDAOTest.class, git.brc.iop.kcl.ac.uk.crisjobmaker.XStreamTranslatorTest.class, git.brc.iop.kcl.ac.uk.crisjobmaker.DatabaseServiceTest.class, git.brc.iop.kcl.ac.uk.crisjobmaker.JSONGeneratorServiceTest.class})
public class CrisjobmakerSuite {

    @Before
    public void setUp() throws Exception {
    }
    
}
