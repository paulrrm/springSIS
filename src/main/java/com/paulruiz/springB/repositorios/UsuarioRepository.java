package com.paulruiz.springB.repositorios;

import com.paulruiz.springB.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
