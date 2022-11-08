package com.farmasur.FarmaSur.models.services;


import com.farmasur.FarmaSur.models.entity.Proveedor;

import java.util.List;
import java.util.Optional;

public interface IProveedorServices {
    public List<Proveedor> getAll();
    public void save(Proveedor proveedor);
    public Optional<Proveedor> finById(Integer id);
    public  void delete(Integer id);
}
