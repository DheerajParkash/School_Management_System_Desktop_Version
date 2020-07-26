/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_managment_system;
import java.sql.*;
/**
 *
 * @author DHEERAJ K'S PC
 */
public class Database {
    Connection con;
    Statement stmt;
    ResultSet rs;
    Database(){
        /**
         * 3306 is the default port for MySQL in XAMPP. Note both the 
         * MySQL server and Apache must be running. 
         */
        String url = "jdbc:mysql://localhost:3306/school_managment_system?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

        /**
         * The MySQL user.
         */
        String user = "root";

        /**
         * Password for the above MySQL user. If no password has been 
         * set (as is the default for the root user in XAMPP's MySQL),
         * an empty string can be used.
         */
        String password = "";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, user, password);
            
            stmt = con.createStatement();
        }
        catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e)
        {
            e.printStackTrace();
        }
    }
}