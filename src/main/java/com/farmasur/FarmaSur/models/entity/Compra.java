package com.farmasur.FarmaSur.models.entity;

import javax.persistence.*;

@Entity
@Table(name = "compra")
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_compra;
    private int id_user;
    private int id_p;
    private String cormprobante;
    private String n_cormprobante;
    private double total;
    private double descuento;
    private double subtotal;
    private double igv;
    private double precio_total;
    private String fecha_com;

    public int getId_co() {
        return id_compra;
    }

    public void setId_co(int id_co) {
        this.id_compra = id_co;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getId_p() {
        return id_p;
    }

    public void setId_p(int id_p) {
        this.id_p = id_p;
    }

    public String getCormprobante() {
        return cormprobante;
    }

    public void setCormprobante(String cormprobante) {
        this.cormprobante = cormprobante;
    }

    public String getN_cormprobante() {
        return n_cormprobante;
    }

    public void setN_cormprobante(String n_cormprobante) {
        this.n_cormprobante = n_cormprobante;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(double precio_total) {
        this.precio_total = precio_total;
    }

    public String getFecha_com() {
        return fecha_com;
    }

    public void setFecha_com(String fecha_com) {
        this.fecha_com = fecha_com;
    }
}
