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
public class ParticipanteMapper implements Mapper <Participante, ParticipanteDTO>{

    @Override
    public ParticipanteDTO toDTO(Participante ent) {
        return new ParticipanteDTO(
                   ent.getId(),
                   ent.getNombre(),
                   ent.getTelefono(),
                   ent.getCorreo()
        );
    }

    @Override
    public Participante toEnt(ParticipanteDTO dto) throws SQLException {
        return new Participante(
                   dto.getId(),
                   dto.getNombre(),
                   dto.getTelefono(),
                   dto.getCorreo()
        );
                
    }

    
    
}
