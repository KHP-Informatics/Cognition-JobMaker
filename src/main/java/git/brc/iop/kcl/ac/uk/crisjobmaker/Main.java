/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.brc.iop.kcl.ac.uk.crisjobmaker;

import java.sql.ResultSet;
import org.json.JSONArray;

/**
 *
 * @author rjackson
 */
public class Main {
    public static void main(String[] args){
        
        

            IOService io = new IOService();
            ConfigDAO config = io.loadConfig(args[0]);

            DatabaseService dbs = new DatabaseService();
            
            ResultSet rs = dbs.getResultSet(config);          
            JSONArray convert = JSONGeneratorService.convert(rs);            
            io.saveJSONArray(convert, config); 
    }
}
