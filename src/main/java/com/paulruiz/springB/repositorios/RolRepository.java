package com.paulruiz.springB.repositorios;

import com.paulruiz.springB.entidades.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepository extends JpaRepository<Rol, Integer> {
}
