/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ravir
 */
public class ConnectionProvider {

//    private static final String DB_NAME = "attendencesystem";
//    private static final String DB_URL = "jdbc:mysql://localhost:3306/";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "System@123";

    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
              Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendencesystem",DB_USERNAME,DB_PASSWORD);
   
            return con;
        }catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
