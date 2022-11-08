package com.farmasur.FarmaSur.models.services;


import com.farmasur.FarmaSur.models.entity.Venta;

import java.util.List;
import java.util.Optional;

public interface IventaServices {
    public List<Venta> getAll();
    public void save(Venta venta);
    public Optional<Venta> finById(Integer id);
    public  void delete(Integer id);
}
