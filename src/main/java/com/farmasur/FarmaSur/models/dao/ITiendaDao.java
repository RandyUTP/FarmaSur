package com.farmasur.FarmaSur.models.dao;

import com.farmasur.FarmaSur.models.entity.Tienda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITiendaDao extends JpaRepository<Tienda, Integer> {
}
