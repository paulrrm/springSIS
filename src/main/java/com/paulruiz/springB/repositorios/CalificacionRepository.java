package com.paulruiz.springB.repositorios;

import com.paulruiz.springB.entidades.Calificacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalificacionRepository extends JpaRepository<Calificacion, Integer> {
}
