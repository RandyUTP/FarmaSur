package com.farmasur.FarmaSur.controllers;

import com.farmasur.FarmaSur.models.entity.Categoria;
import com.farmasur.FarmaSur.models.services.ICategoriaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoriaController {
    @Autowired
    private ICategoriaServices categoriaServices;

    @GetMapping("/categoria")
    public List<Categoria> getCategoria(){

        return categoriaServices.getAll();
    }
}
