package com.farmasur.FarmaSur.models.services;

import com.farmasur.FarmaSur.models.dao.IClienteDao;
import com.farmasur.FarmaSur.models.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ClienteServiceImple implements IClienteServices{
    @Autowired
    private IClienteDao clienteDao;

    @Override
    public List<Cliente> getAll() {
        return clienteDao.findAll();
    }

    @Override
    public void save(Cliente cliente) {

    }

    @Override
    public Optional<Cliente> finById(Integer id) {
        return Optional.empty();
    }

    @Override
    public void delete(Integer id) {

    }
}
