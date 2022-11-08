package com.farmasur.FarmaSur.models.services;

import com.farmasur.FarmaSur.models.dao.IUsuarioDao;
import com.farmasur.FarmaSur.models.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UsuarioServiceImple implements IUsarioServices{
    @Autowired
    private IUsuarioDao usuarioDao;
    @Override
    public List<Usuario> getAll() {
        return usuarioDao.findAll();
    }

    @Override
    public void save(Usuario usuario) {

    }

    @Override
    public Optional<Usuario> finById(Integer id) {
        return Optional.empty();
    }

    @Override
    public void delete(Integer id) {

    }
}
