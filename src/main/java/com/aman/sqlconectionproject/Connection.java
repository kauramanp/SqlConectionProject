/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aman.sqlconectionproject;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Connection {
        private static Connection single_instance = null;
// Declaring a variable of type String
    public String s;
    java.sql.Connection con;
 
    // Constructor
    // Here we will be creating private constructor
    // restricted to this class itself
    private Connection()
    {
         try {
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testingjava", "root", "");
            if (con != null) {
                String createTable = "CREATE TABLE IF NOT EXISTS users (id INT NOT NULL AUTO_INCREMENT , name VARCHAR(255) NOT NULL , class VARCHAR(255) NOT NULL , rollno VARCHAR(255) NOT NULL , PRIMARY KEY (id))";
                PreparedStatement createStatement = con.prepareStatement(createTable);
                createStatement.execute();    
            }
        } catch (SQLException ex) {
            Logger.getLogger(SqlConectionProject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Static method to create instance of Singleton class
    public static Connection getInstance()
    {
        if (single_instance == null)
            single_instance = new Connection();
 
        return single_instance;
    }
    
}
