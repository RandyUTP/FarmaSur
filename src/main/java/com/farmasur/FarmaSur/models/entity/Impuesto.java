package com.farmasur.FarmaSur.models.entity;

import javax.persistence.*;

@Entity
@Table(name = "impuesto")
public class Impuesto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_impu;
    private int id_mon;
    private String impuesto;
    private double porcentaje;
    private double valor;
    private String nombre_tribu;
    private String doc_identidad;

    public int getId_impu() {
        return id_impu;
    }

    public void setId_impu(int id_impu) {
        this.id_impu = id_impu;
    }

    public int getId_mon() {
        return id_mon;
    }

    public void setId_mon(int id_mon) {
        this.id_mon = id_mon;
    }

    public String getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(String impuesto) {
        this.impuesto = impuesto;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNombre_tribu() {
        return nombre_tribu;
    }

    public void setNombre_tribu(String nombre_tribu) {
        this.nombre_tribu = nombre_tribu;
    }

    public String getDoc_identidad() {
        return doc_identidad;
    }

    public void setDoc_identidad(String doc_identidad) {
        this.doc_identidad = doc_identidad;
    }
}
