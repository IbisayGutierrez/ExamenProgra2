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
public class Inscripcion {
    private int id;
    private Taller taller;
    private Participante participante;
    private LocalDate Fecha;
    private Boolean Asistencia;

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

    public void setFecha(LocalDate Fecha) {
        this.Fecha = Fecha;
    }

    public Boolean getAsistencia() {
        return Asistencia;
    }

    public void setAsistencia(Boolean Asistencia) {
        this.Asistencia = Asistencia;
    }

    public Inscripcion(int id, Taller taller, Participante participante, LocalDate Fecha, Boolean Asistencia) {
        this.id = id;
        this.taller = taller;
        this.participante = participante;
        this.Fecha = Fecha;
        this.Asistencia = Asistencia;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "id=" + id + ", taller=" + taller + ", participante=" + participante + ", Fecha=" + Fecha + ", Asistencia=" + Asistencia + '}';
    }
    
  
}
