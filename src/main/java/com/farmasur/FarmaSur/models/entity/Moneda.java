package com.farmasur.FarmaSur.models.entity;

import javax.persistence.*;

@Entity
@Table(name = "moneda")
public class Moneda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_mon;
    private String mon;
    private String simbolo;

    public int getId_mon() {
        return id_mon;
    }

    public void setId_mon(int id_mon) {
        this.id_mon = id_mon;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
}
