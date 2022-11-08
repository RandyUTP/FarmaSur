package com.farmasur.FarmaSur.models.services;


import com.farmasur.FarmaSur.models.entity.Detalle_venta;

import java.util.List;
import java.util.Optional;

public interface IDetalle_venServices {
    public List<Detalle_venta> getAll();
    public void save(Detalle_venta detalle_venta);
    public Optional<Detalle_venta> finById(Integer id);
    public  void delete(Integer id);
}
