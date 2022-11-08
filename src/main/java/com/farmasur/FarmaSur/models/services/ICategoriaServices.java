package com.farmasur.FarmaSur.models.services;

import com.farmasur.FarmaSur.models.entity.Categoria;

import java.util.List;
import java.util.Optional;

public interface ICategoriaServices {
    public List<Categoria> getAll();
    public void save(Categoria categoria);
    public Optional<Categoria> finById(Integer id);
    public  void delete(Integer id);
}
