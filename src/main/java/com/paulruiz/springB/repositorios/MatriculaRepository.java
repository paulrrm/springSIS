package com.paulruiz.springB.repositorios;

import com.paulruiz.springB.entidades.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatriculaRepository extends JpaRepository<Matricula , Integer> {
}
