package com.paulruiz.springB.repositorios;

import com.paulruiz.springB.entidades.Materia;
import com.paulruiz.springB.entidades.Semestre;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface MateriaRepository extends JpaRepository<Materia, Integer> {
    List<Materia> findBySemestre(Semestre semestre);
}
