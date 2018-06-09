
package DAL;

import com.mysql.cj.protocol.Resultset;
import com.sun.jndi.ldap.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hang
 */
public class DBConnect {
   private static final String hostName = "localhost";
   private static final String userName = "root";
   private static final String pass = "";
    private static final String dbName = "quanlyhocsinh";
    private static final String connectionUrl = "jdbc:mysql://"+hostName+":3306/"+ dbName;
    
    public  static  java.sql.Connection MoKetNoi()
    {
       try {
           Class.forName("com.mysql.jdbc.Driver");
           java.sql.Connection con = DriverManager.getConnection(connectionUrl,userName,pass);
           System.out.println("Connected!");
           
           return con;
       } catch (Exception ex) {
           System.out.println("Error"+ex.getMessage());
           ex.printStackTrace();
       }
       return null;
    }
    
    public static void main(String[] args) {
        java.sql.Connection con = DBConnect.MoKetNoi();
//        String sql = "select * from user";
//        try {
//            Statement stm = con.createStatement();
//            ResultSet rs =  stm.executeQuery(sql);
//            while(rs.next()){
//                
//                int id = rs.getInt("id");
//                String name = rs.getString("username");
//                String pass = rs.getString("password");
//                 System.out.println("id:"+id+" name: "+name+" pass: "+pass);
//            }
//            
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
