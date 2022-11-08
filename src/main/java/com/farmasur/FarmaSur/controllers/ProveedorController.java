package com.farmasur.FarmaSur.controllers;

import com.farmasur.FarmaSur.models.entity.Proveedor;
import com.farmasur.FarmaSur.models.services.IProveedorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProveedorController {

    @Autowired
    private IProveedorServices proveedorServices;
    @GetMapping("/proveedor")
    public List<Proveedor> getProveedor(){
        return proveedorServices.getAll();
    }
}
