/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.brc.iop.kcl.ac.uk.crisjobmaker;

import com.thoughtworks.xstream.XStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import org.apache.log4j.Logger;
import org.json.JSONArray;

/**
 *
 * @author rjackson
 */
public class IOService {

    static Logger log = Logger.getLogger(IOService.class.getName());

    public ConfigDAO loadConfig(String configPath) {
        try {
            File file = new File(configPath);
            ConfigDAO config = (ConfigDAO) XStreamTranslator.getInstance().toObject(file);
            return config;
        } catch (IOException ex) {
            log.error(ex.getMessage());
        }
        return null;
    }

    public void saveJSONArray(JSONArray convert, ConfigDAO config) {
        File file = new File(config.getOutputPath());
        try {
        // if file doesnt exists, then create it
        if (!file.exists()) {
                file.createNewFile();
        }        
        

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                bw.write(convert.toString());
            }
        } catch (IOException ex) {
            log.error(ex);
        }
    }
    
    public void saveConfig(Object inst, File file){
        try {
            XStreamTranslator xStreamTranslatorInst = XStreamTranslator.getInstance();        
            xStreamTranslatorInst.toXMLFile(inst, file.getCanonicalPath());
        } catch (IOException ex) {
            log.error(ex);
        }
    }

}
