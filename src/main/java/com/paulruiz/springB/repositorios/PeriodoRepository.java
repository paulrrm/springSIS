package com.paulruiz.springB.repositorios;

import com.paulruiz.springB.entidades.Periodo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeriodoRepository extends JpaRepository<Periodo, Integer> {
}
