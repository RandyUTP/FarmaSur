package com.farmasur.FarmaSur.models.dao;

import com.farmasur.FarmaSur.models.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoDao extends JpaRepository<Producto, Integer> {
}
