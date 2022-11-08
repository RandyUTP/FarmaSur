package com.farmasur.FarmaSur.models.dao;

import com.farmasur.FarmaSur.models.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteDao extends JpaRepository<Cliente, Integer> {
}
