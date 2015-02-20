/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.brc.iop.kcl.ac.uk.crisjobmaker;

/**
 *
 * @author rjackson
 */
public class ConfigDAO {
    private String JDBCString;

//    private String JDBCString = "jdbc:jtds:sqlserver://ec2-54-76-244-178.eu-west-1.compute.amazonaws.com:1433;databaseName=CareNotesTrng";
//    private String UserName = "User1";
//    private String Password = "CrisDevelopment1";
//    private String query = "SELECT TOP 1000 [ID]\n" +
//"      ,[src_table]\n" +
//"      ,[src_col]\n" +
//"      ,[primaryKeyFieldName]\n" +
//"      ,[type]\n" +
//"      ,[doc_ID]\n" +
//"      ,[updatetime]\n" +
//"  FROM [CRIS_REBUILD_TEST_SRC].[dbo].[sourceForPseudo]";
//    private String outputPath = "~/test.json";
    private String UserName;
    private String Password;
    private String query;
    private String outputPath;
    
    
    String getJDBCString() {
        return JDBCString;
    }

    public void setJDBCString(String JDBCString) {
        this.JDBCString = JDBCString;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public void setOutputPath(String outputPath) {
        this.outputPath = outputPath;
    }
    
    String getUserName(){
        return UserName;
    }

    String getPassword(){
        return Password;
    }

    String getQuery() {
        return query;
    }

    String getOutputPath() {
        return outputPath;
    }
}
