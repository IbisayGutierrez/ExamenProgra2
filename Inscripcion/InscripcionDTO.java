/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inscripcion;

import Paticipantes.Participante;
import Taller.Taller;
import java.time.LocalDate;

/**
 *
 * @author Student
 */
public class InscripcionDTO {
   
    private final int id;
    private final Taller taller;
    private final Participante participante;
    private final LocalDate Fecha;
    private final Boolean Asistencia;

    public int getId() {
        return id;
    }

    public Taller getTaller() {
        return taller;
    }

    public Participante getParticipante() {
        return participante;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public Boolean getAsistencia() {
        return Asistencia;
    }

    public InscripcionDTO(int id, Taller taller, Participante participante, LocalDate Fecha, Boolean Asistencia) {
        this.id = id;
        this.taller = taller;
        this.participante = participante;
        this.Fecha = Fecha;
        this.Asistencia = Asistencia;
    }


 
}
