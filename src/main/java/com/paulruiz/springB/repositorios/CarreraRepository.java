package com.paulruiz.springB.repositorios;

import com.paulruiz.springB.entidades.Carrera;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarreraRepository extends JpaRepository<Carrera, Integer> {
}
