/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jerson
 */
public class Conexion {
    Connection con;
      String url="jdbc:mysql://localhost:3306/dcshots";
        String user="jerson";
        String pass="jerson123";
    public Connection Conexion() { 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection(url,user,pass);
        } catch (ClassNotFoundException | SQLException e) {
        }
        return con;
    }
}
