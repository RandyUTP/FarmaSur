package com.farmasur.FarmaSur.models.services;

import com.farmasur.FarmaSur.models.dao.ICompraDao;
import com.farmasur.FarmaSur.models.entity.Compra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompraServiceImple implements ICompraServices{
    @Autowired
    private ICompraDao compraDao;
    @Override
    public List<Compra> getAll() {
        return compraDao.findAll();
    }

    @Override
    public void save(Compra compra) {

    }

    @Override
    public Optional<Compra> finById(Integer id) {
        return Optional.empty();
    }

    @Override
    public void delete(Integer id) {

    }
}
