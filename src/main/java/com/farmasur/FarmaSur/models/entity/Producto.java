package com.farmasur.FarmaSur.models.entity;

import javax.persistence.*;

@Entity
@Table(name = "producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_produc;
    private int id_cat;
    private String codigo;
    private String laboratorio;
    private String marca;
    private String principio_activo;
    private String product;
    private String registro;
    private double precio_com;
    private double precio_men;
    private double precio_may;
    private int stock;
    private int stockmin;
    private double utilidad_men;
    private double utilidad_may;
    private String medida;
    private String fecha_ven;
    private String alarma_ven;

    public int getId_produc() {
        return id_produc;
    }

    public void setId_produc(int id_produc) {
        this.id_produc = id_produc;
    }

    public int getId_cat() {
        return id_cat;
    }

    public void setId_cat(int id_cat) {
        this.id_cat = id_cat;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPrincipio_activo() {
        return principio_activo;
    }

    public void setPrincipio_activo(String principio_activo) {
        this.principio_activo = principio_activo;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public double getPrecio_com() {
        return precio_com;
    }

    public void setPrecio_com(double precio_com) {
        this.precio_com = precio_com;
    }

    public double getPrecio_men() {
        return precio_men;
    }

    public void setPrecio_men(double precio_men) {
        this.precio_men = precio_men;
    }

    public double getPrecio_may() {
        return precio_may;
    }

    public void setPrecio_may(double precio_may) {
        this.precio_may = precio_may;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStockmin() {
        return stockmin;
    }

    public void setStockmin(int stockmin) {
        this.stockmin = stockmin;
    }

    public double getUtilidad_men() {
        return utilidad_men;
    }

    public void setUtilidad_men(double utilidad_men) {
        this.utilidad_men = utilidad_men;
    }

    public double getUtilidad_may() {
        return utilidad_may;
    }

    public void setUtilidad_may(double utilidad_may) {
        this.utilidad_may = utilidad_may;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public String getFecha_ven() {
        return fecha_ven;
    }

    public void setFecha_ven(String fecha_ven) {
        this.fecha_ven = fecha_ven;
    }

    public String getAlarma_ven() {
        return alarma_ven;
    }

    public void setAlarma_ven(String alarma_ven) {
        this.alarma_ven = alarma_ven;
    }
}
