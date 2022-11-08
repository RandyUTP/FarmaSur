package com.farmasur.FarmaSur.models.entity;

import javax.persistence.*;

@Entity
@Table(name = "tipo_user")
public class Tipo_user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Tip_user;
    private String tipo_user;

    public int getId_Tip_user() {
        return id_Tip_user;
    }

    public void setId_Tip_user(int id_Tip_user) {
        this.id_Tip_user = id_Tip_user;
    }

    public String getTipo_user() {
        return tipo_user;
    }

    public void setTipo_user(String tipo_user) {
        this.tipo_user = tipo_user;
    }
}
