/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author c0653616
 */
public class Credentials {
    public static Connection connection() {
        Connection con=null;
        try {
            Class.forName("com.ibm.as400.access.AS400JDBCDriver");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Class not found exception! " + 
                e.getMessage());
        }
        
        String url = "jdbc:as400://174.79.32.158";
        try {
           con = DriverManager.getConnection(url, "IBM77", "IBM77");
        }
        catch (SQLException e) {
            System.out.println("SQL Issue! " + e.getMessage());
            e.printStackTrace();
        }
        return con;
    }

    public static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
