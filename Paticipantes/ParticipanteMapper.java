/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paticipantes;

import MAPPER.Mapper;
import java.sql.SQLException;

/**
 *
 * @author Student
 */
public class ParticipanteMapper implements Mapper <Participante, ParticipanteDAO>{

    @Override
    public ParticipanteDAO toDTO(Participante ent) {
        
    }

    @Override
    public Participante toEnt(ParticipanteDAO dto) throws SQLException {
    }
    
}
