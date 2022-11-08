package com.farmasur.FarmaSur.models.dao;

import com.farmasur.FarmaSur.models.entity.Moneda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMonedaDao extends JpaRepository<Moneda, Integer> {
}
