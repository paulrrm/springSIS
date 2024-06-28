package com.paulruiz.springB.repositorios;

import com.paulruiz.springB.entidades.Clase;
import com.paulruiz.springB.entidades.Materia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClaseRepository extends JpaRepository<Clase, Integer> {

    List<Clase> findAllByMateria (final  Materia materia);
}
