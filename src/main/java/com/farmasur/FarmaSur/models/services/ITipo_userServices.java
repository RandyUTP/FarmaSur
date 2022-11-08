package com.farmasur.FarmaSur.models.services;


import com.farmasur.FarmaSur.models.entity.Tipo_user;

import java.util.List;
import java.util.Optional;

public interface ITipo_userServices {
    public List<Tipo_user> getAll();
    public void save(Tipo_user tipo_user);
    public Optional<Tipo_user> finById(Integer id);
    public  void delete(Integer id);
}
