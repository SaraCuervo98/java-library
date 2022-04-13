package Biblioteca;

import java.time.LocalDate;

public class Autoria {
    // inicializamos los atributos de la clase autoria
    private String nombre, apellidos;
    private LocalDate fechaDeNacimiento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento; }

    public void setFechaDeNacimiento(int year, int month, int dayofMonth) { this.fechaDeNacimiento = fechaDeNacimiento; }

    public Autoria() {

    }

    public Autoria(String nombre, String apellidos, LocalDate fechaDeNacimiento){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    @Override
    public String toString() {
        return "\nNombre y apellidos: " + this.nombre + " " + this.apellidos
                + " y su fecha de nacimiento: " + this.fechaDeNacimiento;
    }

}
