package com.farmasur.FarmaSur.models.dao;

import com.farmasur.FarmaSur.models.entity.Detalle_venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDetalle_venDao extends JpaRepository<Detalle_venta, Integer> {
}
