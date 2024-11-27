/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.SQLException;

/**
 *
 * @author 9567
 * @param <Dto>
 */
public abstract class DaoCRUD<Dto> extends DaoCRD<Dto> {
    
 public abstract boolean update(Dto dto) throws SQLException;


}