/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import java.sql.SQLException;
import java.sql.Connection;

/**
 *
 * @author Student
 */
public abstract class Dao<DTO> {
     protected Connection connection;
     
    public Dao (Connection connection){
    this.connection= connection;
    }
    
//    public abstract boolean Insert () trows SQLExcepcion;
   
    
}
