package com.farmasur.FarmaSur.models.services;

import com.farmasur.FarmaSur.models.dao.ITipoUserDao;
import com.farmasur.FarmaSur.models.entity.Tipo_user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class Tipo_userServiceImple implements ITipo_userServices{
    @Autowired
    private ITipoUserDao tipoUserDao;
    @Override
    public List<Tipo_user> getAll() {
        return tipoUserDao.findAll();
    }

    @Override
    public void save(Tipo_user tipo_user) {

    }

    @Override
    public Optional<Tipo_user> finById(Integer id) {
        return Optional.empty();
    }

    @Override
    public void delete(Integer id) {

    }
}
