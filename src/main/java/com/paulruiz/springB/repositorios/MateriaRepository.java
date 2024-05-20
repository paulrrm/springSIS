package com.paulruiz.springB.repositorios;

import com.paulruiz.springB.entidades.Materia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MateriaRepository extends JpaRepository<Materia, Integer> {
}
