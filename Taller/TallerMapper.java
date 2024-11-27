/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller;

import MAPPER.Mapper;
import java.sql.SQLException;

/**
 *
 * @author Student
 */
public class TallerMapper implements Mapper<Taller,TallerDTO>{

    @Override
    public TallerDTO toDTO(Taller ent) {
        return new TallerDTO (
             ent.getId(),
             ent.getNombre(),
             ent.getFecha(),
             ent.getLugar(),
             ent.getCapacidad()     
        );
               
       
    }

    @Override
    public Taller toEnt(TallerDTO dto) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
