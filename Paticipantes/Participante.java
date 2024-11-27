/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paticipantes;

/**
 *
 * @author Student
 */
public class Participante {
    private int id;
    private String nombre;
    private int telefono;
    private String correo;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Participante(int id, String nombre, int telefono, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Participante{" + "id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + ", correo=" + correo + '}';
    }
    
    
    
}
