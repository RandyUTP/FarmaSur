package com.farmasur.FarmaSur.models.services;

import com.farmasur.FarmaSur.models.dao.IVentaDao;
import com.farmasur.FarmaSur.models.entity.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class VentaServiceImple implements IventaServices{
    @Autowired
    private IVentaDao ventaDao;
    @Override
    public List<Venta> getAll() {
        return ventaDao.findAll();
    }

    @Override
    public void save(Venta venta) {

    }

    @Override
    public Optional<Venta> finById(Integer id) {
        return Optional.empty();
    }

    @Override
    public void delete(Integer id) {

    }
}
