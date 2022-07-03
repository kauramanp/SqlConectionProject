/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.aman.sqlconectionproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 */
public class SqlConectionProject {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testingjava", "root", "");
            if (con != null) {
                String createTable = "CREATE TABLE IF NOT EXISTS `users` (`id` INT NOT NULL AUTO_INCREMENT , `name` VARCHAR(255) NOT NULL , `class` VARCHAR(255) NOT NULL , `rollno` VARCHAR(255) NOT NULL , PRIMARY KEY (`id`))";
                PreparedStatement createStatement = con.prepareStatement(createTable);
                createStatement.execute();
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(SqlConectionProject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
