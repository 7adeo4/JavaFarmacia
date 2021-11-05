package com.exemple.modelos;

public class Clientes {
    
    private int idCliente;
    private String nombre;
    private String apellido;
    private int idObraSocial;

    public Clientes() {
    }

    public Clientes(int idCliente, String nombre, String apellido, int idObraSocial) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.idObraSocial = idObraSocial;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    public int getIdObraSocial() {
        return idObraSocial;
    }

    public void setIdObraSocial(int idObraSocial) {
        this.idObraSocial = idObraSocial;
    }

    @Override
    public String toString() {
        return "Clientes{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", apellido=" + apellido + ", idObraSocial=" + idObraSocial + '}';
    }
    
    
}
