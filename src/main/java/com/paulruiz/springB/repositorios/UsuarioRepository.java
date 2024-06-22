package com.paulruiz.springB.repositorios;

import com.paulruiz.springB.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;


public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {



     List<Usuario> findByCorreoAndClave(String correo, String clave);
     
     // Método para buscar por cédula
     Optional<Usuario> findByCedula(String cedula);
     Optional<Usuario> findBycorreo(String correo);
}


