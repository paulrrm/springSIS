package com.paulruiz.springB.repositorios;

import com.paulruiz.springB.entidades.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepository extends JpaRepository<Tarea, Integer> {
}
