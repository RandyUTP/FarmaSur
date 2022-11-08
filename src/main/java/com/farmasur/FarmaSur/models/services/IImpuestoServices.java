package com.farmasur.FarmaSur.models.services;


import com.farmasur.FarmaSur.models.entity.Impuesto;

import java.util.List;
import java.util.Optional;

public interface IImpuestoServices {
    public List<Impuesto> getAll();
    public void save(Impuesto impuesto);
    public Optional<Impuesto> finById(Integer id);
    public  void delete(Integer id);
}
