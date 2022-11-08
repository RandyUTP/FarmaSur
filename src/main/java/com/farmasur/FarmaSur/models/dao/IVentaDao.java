package com.farmasur.FarmaSur.models.dao;

import com.farmasur.FarmaSur.models.entity.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVentaDao extends JpaRepository<Venta, Integer> {
}
