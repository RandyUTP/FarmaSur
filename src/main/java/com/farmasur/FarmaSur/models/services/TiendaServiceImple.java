package com.farmasur.FarmaSur.models.services;

import com.farmasur.FarmaSur.models.dao.ITiendaDao;
import com.farmasur.FarmaSur.models.entity.Tienda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TiendaServiceImple implements ITiendaServices{
    @Autowired
    private ITiendaDao tiendaDao;
    @Override
    public List<Tienda> getAll() {
        return tiendaDao.findAll();
    }

    @Override
    public void save(Tienda tienda) {

    }

    @Override
    public Optional<Tienda> finById(Integer id) {
        return Optional.empty();
    }

    @Override
    public void delete(Integer id) {

    }
}
