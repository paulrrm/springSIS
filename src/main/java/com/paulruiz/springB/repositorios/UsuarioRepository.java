package com.paulruiz.springB.repositorios;

import com.paulruiz.springB.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

     List<Usuario> findByCorreo(String correo);

     List<Usuario> findByCorreoAndClave(String correo, String clave);
}


