package com.farmasur.FarmaSur.models.dao;

import com.farmasur.FarmaSur.models.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoriaDao extends JpaRepository<Categoria,Integer> {
}
