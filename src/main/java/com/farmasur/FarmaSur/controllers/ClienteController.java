package com.farmasur.FarmaSur.controllers;

import com.farmasur.FarmaSur.models.entity.Cliente;
import com.farmasur.FarmaSur.models.services.IClienteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClienteController {

    @Autowired
    private IClienteServices clienteServices;

    @GetMapping("/clientes")
    public List<Cliente> getClientes(){
        return clienteServices.getAll();
    }
}
