package com.farmasur.FarmaSur.controllers;

import com.farmasur.FarmaSur.models.entity.Moneda;
import com.farmasur.FarmaSur.models.services.IMonedaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MonedaController {
    @Autowired
    private IMonedaServices monedaServices;

    @GetMapping("/moneda")
    public List<Moneda> getMoneda(){
        return monedaServices.getAll();
    }
}
