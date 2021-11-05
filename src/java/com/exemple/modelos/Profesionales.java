package com.exemple.modelos;

public class Profesionales {
    private int idProfesional;
    private String nombre;
    private String apellido;
    private int matricula;

    public Profesionales() {
    }

    public Profesionales(int idProfesional, String nombre, String apellido, int matricula) {
        this.idProfesional = idProfesional;
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
    }

    public int getIdProfesional() {
        return idProfesional;
    }

    public void setIdProfesional(int idProfesional) {
        this.idProfesional = idProfesional;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Profesionales{" + "idProfesional=" + idProfesional + ", nombre=" + nombre + ", apellido=" + apellido + ", matricula=" + matricula + '}';
    }
    
    
}
