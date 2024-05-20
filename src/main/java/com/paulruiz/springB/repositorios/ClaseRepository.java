package com.paulruiz.springB.repositorios;

import com.paulruiz.springB.entidades.Clase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClaseRepository extends JpaRepository<Clase, Integer> {
}
