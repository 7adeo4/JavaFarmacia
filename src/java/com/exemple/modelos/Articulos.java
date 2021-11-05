package com.exemple.modelos;

public class Articulos {

    private int idArticulo;
    private String descripcion;
    private float precio;
    private int stockActual;
    private int stockMin;
    private int idTipoArticulo;

    public Articulos() {
    }

    public Articulos(int idArticulo, String descripcion, float precio, int stockActual, int stockMin, int idTipoArticulo) {
        this.idArticulo = idArticulo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stockActual = stockActual;
        this.stockMin = stockMin;
        this.idTipoArticulo = idTipoArticulo;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public int getStockMin() {
        return stockMin;
    }

    public void setStockMin(int stockMin) {
        this.stockMin = stockMin;
    }

    public int getIdTipoArticulo() {
        return idTipoArticulo;
    }

    public void setIdTipoArticulo(int idTipoArticulo) {
        this.idTipoArticulo = idTipoArticulo;
    }

    @Override
    public String toString() {
        return "Articulos{" + "idArticulo=" + idArticulo + ", descripcion=" + descripcion + ", precio=" + precio + ", stockActual=" + stockActual + ", stockMin=" + stockMin + ", idTipoArticulo=" + idTipoArticulo + '}';
    }

}
