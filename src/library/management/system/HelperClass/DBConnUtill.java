
package library.management.system.HelperClass;

import java.sql.Connection;
import java.sql.DriverManager;


public final class DBConnUtill {
    static Connection conn;
    
    public static Connection getConn(){
    
        if(conn!=null){
            return conn;
        }
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            System.out.println("Driver is loaded..");
            
           // conn=DriverManager.getConnection("jdbc:derby://localhost:1527/LMS_Data_Base;create=true", "app", "app");
            conn=DriverManager.getConnection("jdbc:derby://localhost:1527/LMSDataBase;create=true", "app", "app");
            System.out.println("Connection Ok..");
           
        } catch (Exception e) {
            
        }
        return conn;
    }
}
