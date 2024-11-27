/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller;

import java.time.LocalDate;

/**
 *
 * @author Student
 */
public class Taller {
    private int Id;
    private String Nombre;
    private LocalDate Fecha;
    private String Lugar;
    private String Capacidad;

    public int getId() {
        return Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public String getLugar() {
        return Lugar;
    }

    public String getCapacidad() {
        return Capacidad;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public Taller(int Id, String Nombre, LocalDate Fecha, String Lugar, String Capacidad) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Fecha = Fecha;
        this.Lugar = Lugar;
        this.Capacidad = Capacidad;
    }


    
    
    
}
