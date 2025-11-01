/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author azuce
 */
public class Persona {
    private String nombreCompleto;
    private String id;
    private int edad;
    private String correo;
    private String telefono;
    private LocalDateTime fechaRegistro;

    public Persona(String nombreCompleto, String id, int edad, String correo, String telefono) {
        this.nombreCompleto = nombreCompleto;
        this.id = id;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
        this.fechaRegistro = LocalDateTime.now();
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
    public String toLineaArchivo() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String fechaFormateada = fechaRegistro.format(formato);
        
        return String.format("%s|%s|%d|%s|%s|%s",
                           nombreCompleto,
                           id,
                           edad,
                           correo,
                           telefono,
                           fechaFormateada);
    }

    @Override
    public String toString() {
        return "Persona{" + "nombreCompleto=" + nombreCompleto + ", id=" + id 
                + ", edad=" + edad + ", correo=" + correo + ", telefono=" + telefono 
                + ", fechaRegistro=" + fechaRegistro + '}';
    }
    
    
    
}
