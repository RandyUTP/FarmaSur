package com.farmasur.FarmaSur.models.services;


import com.farmasur.FarmaSur.models.entity.Compra;

import java.util.List;
import java.util.Optional;

public interface ICompraServices {
    public List<Compra> getAll();
    public void save(Compra compra);
    public Optional<Compra> finById(Integer id);
    public  void delete(Integer id);
}
