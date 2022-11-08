package com.farmasur.FarmaSur.models.services;


import com.farmasur.FarmaSur.models.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface IUsarioServices {
    public List<Usuario> getAll();
    public void save(Usuario usuario);
    public Optional<Usuario> finById(Integer id);
    public  void delete(Integer id);
}
