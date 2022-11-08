package com.farmasur.FarmaSur.models.services;


import com.farmasur.FarmaSur.models.entity.Tienda;

import java.util.List;
import java.util.Optional;

public interface ITiendaServices {
    public List<Tienda> getAll();
    public void save(Tienda tienda);
    public Optional<Tienda> finById(Integer id);
    public  void delete(Integer id);
}
