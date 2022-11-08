package com.farmasur.FarmaSur.models.entity;

import javax.persistence.*;

@Entity
@Table(name = "tienda")
public class Tienda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_t;
    private String nombre;
    private String ruc;
    private String telefono;
    private String correo;
    private String direccion;
    private String text_repor;

    public int getId_t() {
        return id_t;
    }

    public void setId_t(int id_t) {
        this.id_t = id_t;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getText_repor() {
        return text_repor;
    }

    public void setText_repor(String text_repor) {
        this.text_repor = text_repor;
    }
}
