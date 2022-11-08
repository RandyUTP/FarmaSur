package com.farmasur.FarmaSur.models.dao;

import com.farmasur.FarmaSur.models.entity.Detalle_compra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDetalle_comDao extends JpaRepository<Detalle_compra, Integer> {
}
