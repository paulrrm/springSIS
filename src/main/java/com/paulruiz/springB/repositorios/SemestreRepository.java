package com.paulruiz.springB.repositorios;

import com.paulruiz.springB.entidades.Semestre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SemestreRepository extends JpaRepository<Semestre,Integer> {
}
