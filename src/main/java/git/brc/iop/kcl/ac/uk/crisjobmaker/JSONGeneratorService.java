/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.brc.iop.kcl.ac.uk.crisjobmaker;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author rjackson
 */
public class JSONGeneratorService {
static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(JSONGeneratorService.class.getName());    
  public static JSONArray convert( ResultSet rs ){
      try {
          JSONArray json = new JSONArray();
          ResultSetMetaData rsmd = rs.getMetaData();
          
          int rowCount = 1;
          while(rs.next()) {
              int numColumns = rsmd.getColumnCount();
              JSONObject obj = new JSONObject();
              
              for (int i=1; i<numColumns+1; i++) {
                  String column_name = rsmd.getColumnName(i);
                  
                  if(rsmd.getColumnType(i)==java.sql.Types.ARRAY){
                      obj.put(column_name, rs.getArray(column_name));
                  }
                  else if(rsmd.getColumnType(i)==java.sql.Types.BIGINT){
                      obj.put(column_name, rs.getInt(column_name));
                  }
                  else if(rsmd.getColumnType(i)==java.sql.Types.BOOLEAN){
                      obj.put(column_name, rs.getBoolean(column_name));
                  }
                  else if(rsmd.getColumnType(i)==java.sql.Types.BLOB){
                      obj.put(column_name, rs.getBlob(column_name));
                  }
                  else if(rsmd.getColumnType(i)==java.sql.Types.DOUBLE){
                      obj.put(column_name, rs.getDouble(column_name));
                  }
                  else if(rsmd.getColumnType(i)==java.sql.Types.FLOAT){
                      obj.put(column_name, rs.getFloat(column_name));
                  }
                  else if(rsmd.getColumnType(i)==java.sql.Types.INTEGER){
                      obj.put(column_name, rs.getInt(column_name));
                  }
                  else if(rsmd.getColumnType(i)==java.sql.Types.NVARCHAR){
                      obj.put(column_name, rs.getNString(column_name));
                  }
                  else if(rsmd.getColumnType(i)==java.sql.Types.VARCHAR){
                      obj.put(column_name, rs.getString(column_name));
                  }
                  else if(rsmd.getColumnType(i)==java.sql.Types.TINYINT){
                      obj.put(column_name, rs.getInt(column_name));
                  }
                  else if(rsmd.getColumnType(i)==java.sql.Types.SMALLINT){
                      obj.put(column_name, rs.getInt(column_name));
                  }
                  else if(rsmd.getColumnType(i)==java.sql.Types.DATE){
                      obj.put(column_name, rs.getDate(column_name));
                  }
                  else if(rsmd.getColumnType(i)==java.sql.Types.TIMESTAMP){
                      obj.put(column_name, rs.getTimestamp(column_name));
                  }
                  else{
                      obj.put(column_name, rs.getObject(column_name));
                  }
              }
              
              json.put(obj);
              log.info(rowCount + " jsons generated");
              rowCount++;
          }
          
          return json;
      } catch (SQLException ex) {
          log.error(ex.getMessage());
      }
      return null;
  }
}