package com.exemple.modelos;

public class ObrasSociales {

    private int idObraSocial;
    private String nombre;

    public ObrasSociales() {
    }

    public ObrasSociales(int idObraSocial, String nombre) {
        this.idObraSocial = idObraSocial;
        this.nombre = nombre;
    }

    public int getIdObraSocial() {
        return idObraSocial;
    }

    public void setIdObraSocial(int idObraSocial) {
        this.idObraSocial = idObraSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "ObrasSociales{" + "idObraSocial=" + idObraSocial + ", nombre=" + nombre + '}';
    }
}
