package com.farmasur.FarmaSur.models.services;


import com.farmasur.FarmaSur.models.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface IProductoServices {
    public List<Producto> getAll();
    public void save(Producto producto);
    public Optional<Producto> finById(Integer id);
    public  void delete(Integer id);
}
