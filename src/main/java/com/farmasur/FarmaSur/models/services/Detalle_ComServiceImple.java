package com.farmasur.FarmaSur.models.services;

import com.farmasur.FarmaSur.models.dao.IDetalle_comDao;
import com.farmasur.FarmaSur.models.entity.Detalle_compra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Detalle_ComServiceImple implements IDetalle_comServices{
    @Autowired
    private IDetalle_comDao detalle_comDao;
    @Override
    public List<Detalle_compra> getAll() {
        return detalle_comDao.findAll();
    }

    @Override
    public void save(Detalle_compra detalle_compra) {

    }

    @Override
    public Optional<Detalle_compra> finById(Integer id) {
        return Optional.empty();
    }

    @Override
    public void delete(Integer id) {

    }
}
