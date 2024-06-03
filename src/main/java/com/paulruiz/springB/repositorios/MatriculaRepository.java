package com.paulruiz.springB.repositorios;

import com.paulruiz.springB.entidades.Matricula;


import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MatriculaRepository extends JpaRepository<Matricula , Integer> {

    // List<Usuario> findByCorreoAndClave(String correo, String clave);
    List<Matricula> findByActivoAndUsuario(Boolean activo, Integer usuario); 
}
