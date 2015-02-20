/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.brc.iop.kcl.ac.uk.crisjobmaker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.json.JSONArray;


/**
 *
 * @author rjackson
 */
public class DatabaseService {
    static Logger log = Logger.getLogger(DatabaseService.class.getName());
    
//        private Connection getExternalConnection(ConfigDAO config) throws SQLException {
//        Connection newCon = null;
//        Properties connectionProps = new Properties();
//        connectionProps.put("user", "user1");
//
//        connectionProps.put("password", "CrisDevelopment1");
////        connectionProps.put("defaultRowPrefetch", "1000");
////        connectionProps.put("defaultBatchValue", "1000");
////        connectionProps.put("tcpKeepAlive", "true");
//        newCon = DriverManager.getConnection("jdbc:sqlserver://ec2-54-76-244-178.eu-west-1.compute.amazonaws.com:1433;databaseName=CareNotesTrng", connectionProps);
//                                              jdbc:sqlserver://ec2-54-76-244-178.eu-west-1.compute.amazonaws.com:1433;databaseName=CRIS_REBUILD_TEST_SRC
//        newCon.setAutoCommit(false);
//        return newCon;
//    }
    private Connection getExternalConnection(ConfigDAO config) throws SQLException {
        Connection newCon;
        Properties connectionProps = new Properties();
        connectionProps.put("user", config.getUserName());

        connectionProps.put("password", config.getPassword());
        connectionProps.put("defaultRowPrefetch", "1000");
        connectionProps.put("defaultBatchValue", "1000");
        connectionProps.put("tcpKeepAlive", "true");
//        newCon = DriverManager.getConnection("jdbc:jtds:sqlserver://ec2-54-76-244-178.eu-west-1.compute.amazonaws.com:1433;databaseName=CareNotesTrng", connectionProps);
        // config.getJDBCString()	String	ObjectVariable 	
        newCon = DriverManager.getConnection(config.getJDBCString(),connectionProps);
        newCon.setAutoCommit(false);
        return newCon;
    }
    public ResultSet getResultSet(ConfigDAO config){
        try {
            Connection con = getExternalConnection(config);
            Statement statement = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = statement.executeQuery(config.getQuery());
            return rs;
        } catch (SQLException ex) {
            log.error(ex);
        }        
        return null;
    }
}
