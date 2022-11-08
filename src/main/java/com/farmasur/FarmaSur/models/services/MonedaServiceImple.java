package com.farmasur.FarmaSur.models.services;

import com.farmasur.FarmaSur.models.dao.IMonedaDao;
import com.farmasur.FarmaSur.models.entity.Moneda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MonedaServiceImple implements IMonedaServices{
    @Autowired
    private IMonedaDao monedaDao;
    @Override
    public List<Moneda> getAll() {
        return monedaDao.findAll();
    }

    @Override
    public void save(Moneda moneda) {

    }

    @Override
    public Optional<Moneda> finById(Integer id) {
        return Optional.empty();
    }

    @Override
    public void delete(Integer id) {

    }
}
