package com.farmasur.FarmaSur.models.dao;

import com.farmasur.FarmaSur.models.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioDao extends JpaRepository<Usuario, Integer> {
}
