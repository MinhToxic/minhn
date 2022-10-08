
package context;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;




public class DBContext {
    public static Connection getConnection(){
        Connection conn = null;
        try {
            
            
            String chuoiketnoi = "jdbc:sqlserver://localhost:1433; databasename= StoreHM; user = sa; password=123456";
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
          conn = DriverManager.getConnection(chuoiketnoi);
            System.out.println("Thành CÔng");
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }  
    public static void main(String[] args) {
        System.out.println(DBContext.getConnection().toString());
    }
}
 