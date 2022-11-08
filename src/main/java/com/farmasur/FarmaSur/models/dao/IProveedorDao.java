package com.farmasur.FarmaSur.models.dao;

import com.farmasur.FarmaSur.models.entity.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProveedorDao extends JpaRepository<Proveedor, Integer> {
}
