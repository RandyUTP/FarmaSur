package com.farmasur.FarmaSur.controllers;

import com.farmasur.FarmaSur.models.entity.Producto;
import com.farmasur.FarmaSur.models.services.IProductoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductoController {

    @Autowired
    private IProductoServices productoServices;

    @GetMapping("/producto")
    public List<Producto> getProductos(){
        return productoServices.getAll();
    }
}
