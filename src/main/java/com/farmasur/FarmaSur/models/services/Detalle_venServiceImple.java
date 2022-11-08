package com.farmasur.FarmaSur.models.services;

import com.farmasur.FarmaSur.models.dao.IDetalle_venDao;
import com.farmasur.FarmaSur.models.entity.Detalle_venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Detalle_venServiceImple implements  IDetalle_venServices{
    @Autowired
    private IDetalle_venDao detalle_venDao;
    @Override
    public List<Detalle_venta> getAll() {
        return detalle_venDao.findAll();
    }

    @Override
    public void save(Detalle_venta detalle_venta) {

    }

    @Override
    public Optional<Detalle_venta> finById(Integer id) {
        return Optional.empty();
    }

    @Override
    public void delete(Integer id) {

    }
}
