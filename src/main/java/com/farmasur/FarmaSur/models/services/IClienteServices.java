package com.farmasur.FarmaSur.models.services;


import com.farmasur.FarmaSur.models.entity.Cliente;

import java.util.List;
import java.util.Optional;

public interface IClienteServices {
    public List<Cliente> getAll();
    public void save(Cliente cliente);
    public Optional<Cliente> finById(Integer id);
    public  void delete(Integer id);
}
