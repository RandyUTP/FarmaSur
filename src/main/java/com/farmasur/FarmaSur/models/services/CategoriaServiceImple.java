package com.farmasur.FarmaSur.models.services;

import com.farmasur.FarmaSur.models.dao.ICategoriaDao;
import com.farmasur.FarmaSur.models.entity.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServiceImple implements ICategoriaServices{
    @Autowired
    private ICategoriaDao categoriaDao;

    @Override
    public List<Categoria> getAll() {

        return categoriaDao.findAll();
    }

    @Override
    public void save(Categoria categoria) {
        categoriaDao.save(categoria);
    }

    @Override
    public Optional<Categoria> finById(Integer id) {

        return categoriaDao.findById(id);
    }

    @Override
    public void delete(Integer id) {
        categoriaDao.deleteById(id);
    }
}
