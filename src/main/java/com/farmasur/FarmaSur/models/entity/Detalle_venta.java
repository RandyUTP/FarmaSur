package com.farmasur.FarmaSur.models.entity;

import javax.persistence.*;

@Entity
@Table(name = "detalle_venta")
public class Detalle_venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_vent;
    private int id_produc;
    private double precio;
    private int cantidad;
    private double total_dc;

    public int getId_vent() {
        return id_vent;
    }

    public void setId_vent(int id_vent) {
        this.id_vent = id_vent;
    }

    public int getId_produc() {
        return id_produc;
    }

    public void setId_produc(int id_produc) {
        this.id_produc = id_produc;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal_dc() {
        return total_dc;
    }

    public void setTotal_dc(double total_dc) {
        this.total_dc = total_dc;
    }
}
