package com.farmasur.FarmaSur.models.entity;

import javax.persistence.*;

@Entity
@Table(name = "venta")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_venta;
    private int id_user;
    private int id_cl;
    private String cormprobante;
    private String n_cormprobante;
    private double total;
    private double descuento;
    private double subtotal;
    private double igv;
    private double precio_total;
    private double pago_con;
    private double cambio;
    private String fecha_ven;
    private String combiciones_pag;
    private int id_mon;

    public int getId_compra() {
        return id_venta;
    }

    public void setId_compra(int id_compra) {
        this.id_venta = id_compra;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getId_cl() {
        return id_cl;
    }

    public void setId_cl(int id_cl) {
        this.id_cl = id_cl;
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

    public double getPago_con() {
        return pago_con;
    }

    public void setPago_con(double pago_con) {
        this.pago_con = pago_con;
    }

    public double getCambio() {
        return cambio;
    }

    public void setCambio(double cambio) {
        this.cambio = cambio;
    }

    public String getFecha_ven() {
        return fecha_ven;
    }

    public void setFecha_ven(String fecha_ven) {
        this.fecha_ven = fecha_ven;
    }

    public String getCombiciones_pag() {
        return combiciones_pag;
    }

    public void setCombiciones_pag(String combiciones_pag) {
        this.combiciones_pag = combiciones_pag;
    }

    public int getId_mon() {
        return id_mon;
    }

    public void setId_mon(int id_mon) {
        this.id_mon = id_mon;
    }
}
