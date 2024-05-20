package com.paulruiz.springB.controladores;


import com.paulruiz.springB.entidades.Clase;
import com.paulruiz.springB.entidades.Rol;
import com.paulruiz.springB.entidades.Usuario;
import com.paulruiz.springB.repositorios.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/avirtual")
public class AulaVirtualController {

    @Autowired
    CalificacionRepository calificacionRepository;
    @Autowired
    CarreraRepository carreraRepository;
    @Autowired
    ClaseRepository claseRepository;
    @Autowired
    MateriaRepository materiaRepository;
    @Autowired
    MatriculaRepository matriculaRepository;
    @Autowired
    PeriodoRepository periodoRepository;
    @Autowired
    RolRepository rolRepository;
    @Autowired
    SemestreRepository semestreRepository;
    @Autowired
    TareaRepository tareaRepository;
    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping("/rol")
    public List<Rol> getRol(){
        return rolRepository.findAll();
    }
    @PostMapping("/rol")
    public Rol postRol(@RequestBody Rol rol){
        return rolRepository.save(rol);
    }
    @DeleteMapping("/rol/{id}")
    public Rol postRol(@PathVariable Integer id){
        try {
            Optional<Rol> encontrado = rolRepository.findById(id);
            rolRepository.delete(encontrado.get());
            return encontrado.get();
        }
        catch (Exception ex){
             return null;
        }
    }
    @PutMapping("/rol")
    public Rol putRol(@RequestBody Rol rol){
        try {
            Optional<Rol> encontrado = rolRepository.findById(rol.getIdRol());
            Rol rolexistente = encontrado.get();
            rolexistente.setIdRol(rol.getIdRol());
            rolexistente.setDescripcion(rol.getDescripcion());
            rolexistente.setNombre(rol.getNombre());
            rolexistente.setPermisos(rol.getPermisos());
            return rolRepository.save(rolexistente);
        }
        catch (Exception ex){
            return null;
        }
    }

    ////////////////
    @GetMapping("/usuario")
    public List<Usuario> getUsuario(){
        return usuarioRepository.findAll();
    }


}
