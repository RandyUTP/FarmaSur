package com.farmasur.FarmaSur.models.services;

import com.farmasur.FarmaSur.models.dao.IProveedorDao;
import com.farmasur.FarmaSur.models.entity.Proveedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProveedorServiceImple implements IProveedorServices{
    @Autowired
    private IProveedorDao proveedorDao;
    @Override
    public List<Proveedor> getAll() {
        return proveedorDao.findAll();
    }

    @Override
    public void save(Proveedor proveedor) {

    }

    @Override
    public Optional<Proveedor> finById(Integer id) {
        return Optional.empty();
    }

    @Override
    public void delete(Integer id) {

    }
}
