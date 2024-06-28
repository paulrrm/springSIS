package com.paulruiz.springB.repositorios;

import com.paulruiz.springB.entidades.Materia;
import com.paulruiz.springB.entidades.Matricula;
import com.paulruiz.springB.entidades.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MatriculaRepository extends JpaRepository<Matricula , Integer> {

    //List<Matricula> findByActivo(@Param("activo") Boolean activo); 
    List<Matricula> findByActivoAndUsuario(@Param("activo") Boolean activo, @Param("usuario") Usuario usuario); 
}
