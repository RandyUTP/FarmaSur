package com.farmasur.FarmaSur.models.services;

import com.farmasur.FarmaSur.models.dao.IProductoDao;
import com.farmasur.FarmaSur.models.dao.IProveedorDao;
import com.farmasur.FarmaSur.models.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductoServiceImple implements IProductoServices{
    @Autowired
    private IProductoDao productoDao;
    @Override
    public List<Producto> getAll() {
        return productoDao.findAll();
    }

    @Override
    public void save(Producto producto) {

    }

    @Override
    public Optional<Producto> finById(Integer id) {
        return Optional.empty();
    }

    @Override
    public void delete(Integer id) {

    }
}
