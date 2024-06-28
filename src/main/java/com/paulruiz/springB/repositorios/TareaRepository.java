package com.paulruiz.springB.repositorios;

import com.paulruiz.springB.entidades.Materia;
import com.paulruiz.springB.entidades.Tarea;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepository extends JpaRepository<Tarea, Integer> {
    List<Tarea> findAllByMateria (final  Materia materia);
}

