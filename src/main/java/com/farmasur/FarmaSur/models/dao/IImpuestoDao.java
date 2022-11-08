package com.farmasur.FarmaSur.models.dao;

import com.farmasur.FarmaSur.models.entity.Impuesto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IImpuestoDao extends JpaRepository<Impuesto, Integer> {
}
