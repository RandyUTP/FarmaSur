package com.farmasur.FarmaSur.models.dao;

import com.farmasur.FarmaSur.models.entity.Compra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICompraDao extends JpaRepository<Compra, Integer> {
}
