package com.farmasur.FarmaSur.models.services;

import com.farmasur.FarmaSur.models.dao.IImpuestoDao;
import com.farmasur.FarmaSur.models.entity.Impuesto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ImpuestoServiceImple implements IImpuestoServices{
    @Autowired
    private IImpuestoDao iImpuestoDao;
    @Override
    public List<Impuesto> getAll() {
        return iImpuestoDao.findAll();
    }

    @Override
    public void save(Impuesto impuesto) {

    }

    @Override
    public Optional<Impuesto> finById(Integer id) {
        return Optional.empty();
    }

    @Override
    public void delete(Integer id) {

    }
}
