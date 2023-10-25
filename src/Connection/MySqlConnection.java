/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.*;
/**
 *
 * @author Rehan Ramzan
 */
public class MySqlConnection {
    public static Connection  Connect()
    {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/NustMedicalCentre","root","Pakistan@123");
            return con;
        } catch (ClassNotFoundException ex) {
            System.out.println("Error"+ex.getMessage());
        }
        catch(SQLException e){
            System.out.println("Error"+e.getMessage());
        }
        return con;
    }
}
