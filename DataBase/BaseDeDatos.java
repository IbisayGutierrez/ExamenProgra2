/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBase;


import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Student
 */
public class BaseDeDatos {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/gestiontaller";
    private static final String USER = "root";
    private static final String PASSW = "";
    
    public static Connection getConnection() throws SQLException{ 
        return DriverManager.getConnection(URL, USER, PASSW); 
    }
    
}