package com.farmasur.FarmaSur.models.services;


import com.farmasur.FarmaSur.models.entity.Moneda;

import java.util.List;
import java.util.Optional;

public interface IMonedaServices {
    public List<Moneda> getAll();
    public void save(Moneda moneda);
    public Optional<Moneda> finById(Integer id);
    public  void delete(Integer id);
}
