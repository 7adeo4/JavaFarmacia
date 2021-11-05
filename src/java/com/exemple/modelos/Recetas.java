package com.exemple.modelos;

public class Recetas {

    private int idReceta;
    private int idCliente;
    private int idProfesional;
    private int idMetodoPago;
    private int idSucursal;

    public Recetas() {
    }

    public Recetas(int idReceta, int idCliente, int idProfesional, int idMetodoPago, int idSucursal) {
        this.idReceta = idReceta;
        this.idCliente = idCliente;
        this.idProfesional = idProfesional;
        this.idMetodoPago = idMetodoPago;
        this.idSucursal = idSucursal;
    }

    public int getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdProfesional() {
        return idProfesional;
    }

    public void setIdProfesional(int idProfesional) {
        this.idProfesional = idProfesional;
    }

    public int getIdMetodoPago() {
        return idMetodoPago;
    }

    public void setIdMetodoPago(int idMetodoPago) {
        this.idMetodoPago = idMetodoPago;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    @Override
    public String toString() {
        return "Recetas{" + "idReceta=" + idReceta + ", idCliente=" + idCliente + ", idProfesional=" + idProfesional + ", idMetodoPago=" + idMetodoPago + ", idSucursal=" + idSucursal + '}';
    }

    
}
