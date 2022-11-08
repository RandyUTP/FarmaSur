package com.farmasur.FarmaSur.models.services;


import com.farmasur.FarmaSur.models.entity.Detalle_compra;

import java.util.List;
import java.util.Optional;

public interface IDetalle_comServices {
    public List<Detalle_compra> getAll();
    public void save(Detalle_compra detalle_compra);
    public Optional<Detalle_compra> finById(Integer id);
    public  void delete(Integer id);
}
