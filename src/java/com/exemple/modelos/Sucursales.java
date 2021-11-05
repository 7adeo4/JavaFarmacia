package com.exemple.modelos;

public class Sucursales {
    private int idSucursal;
    private String direccion;

    public Sucursales() {
    }

    public Sucursales(int idSucursal, String direccion) {
        this.idSucursal = idSucursal;
        this.direccion = direccion;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Sucursales{" + "idSucursal=" + idSucursal + ", direccion=" + direccion + '}';
    }
    
    
}
