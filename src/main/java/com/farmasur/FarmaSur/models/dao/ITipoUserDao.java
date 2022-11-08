package com.farmasur.FarmaSur.models.dao;

import com.farmasur.FarmaSur.models.entity.Tipo_user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITipoUserDao extends JpaRepository<Tipo_user, Integer> {
}
