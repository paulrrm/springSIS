package com.paulruiz.springB.controladores;


import com.paulruiz.springB.entidades.Carrera;
import com.paulruiz.springB.entidades.Clase;
import com.paulruiz.springB.entidades.Rol;
import com.paulruiz.springB.entidades.Semestre;
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
    @PostMapping("/usuario")
    public Usuario postUsuario(@RequestBody Usuario usuario){
        return usuarioRepository.save(usuario);
    }
    @DeleteMapping("/usuario/{id}")
    public Usuario deleteUsuario(@PathVariable Integer id){
        try {
            Optional<Usuario> encontrado = usuarioRepository.findById(id);
            usuarioRepository.delete(encontrado.get());
            return encontrado.get();
        }
        catch (Exception ex){
             return null;
        }
    }
    @PutMapping("/usuario")
    public Usuario putUsuario(@RequestBody Usuario usuario){
        try {
            Optional<Usuario> encontrado = usuarioRepository.findById(usuario.getIdUsuario());
            Usuario usuariolexistente = encontrado.get();
            usuariolexistente.setCedula(usuario.getCedula());
            usuariolexistente.setClave(usuario.getClave());
            usuariolexistente.setCorreo(usuario.getCorreo());
            usuariolexistente.setDireccion(usuario.getDireccion());
            usuariolexistente.setNombre(usuario.getNombre());
            usuariolexistente.setRol(usuario.getRol());
            usuariolexistente.setTelefono(usuario.getTelefono());
            return usuarioRepository.save(usuariolexistente);
        }
        catch (Exception ex){
            return null;
        }
    }
    /////////////////////////
    @GetMapping("/carrera")
    public List<Carrera> getCarrera(){
        return carreraRepository.findAll();
    }
    @PostMapping("/carrera")
    public Carrera postCarrera(@RequestBody Carrera carrera){
        return carreraRepository.save(carrera);
    }
    @DeleteMapping("/carrera/{id}")
    public Carrera deleteCarrera(@PathVariable Integer id){
        try {
            Optional<Carrera> encontrado = carreraRepository.findById(id);
            carreraRepository.delete(encontrado.get());
            return encontrado.get();
        }
        catch (Exception ex){
             return null;
        }
    }
    

    @PutMapping("/carrera")
    public Carrera putCarrera(@RequestBody Carrera carrera){
        try {
            Optional<Carrera> encontrado = carreraRepository.findById(carrera.getIdCarrera());
            Carrera carreraexistente = encontrado.get();
            carreraexistente.setNombre(carrera.getNombre());
            carreraexistente.setDescripcion(carrera.getDescripcion());
            return carreraRepository.save(carreraexistente);
        }
        catch (Exception ex){
            return null;
        }
    }
    /////////////////////////
    @GetMapping("/semestre")
    public List<Semestre> getSemestre(){
        return semestreRepository.findAll();
    }
    @PostMapping("/semestre")
    public Semestre postSemestre(@RequestBody Semestre semestre){
        return semestreRepository.save(semestre);
    }
    @DeleteMapping("/semestre/{id}")
    public Semestre deleteSemestre(@PathVariable Integer id){
        try {
            Optional<Semestre> encontrado = semestreRepository.findById(id);
            semestreRepository.delete(encontrado.get());
            return encontrado.get();
        }
        catch (Exception ex){
             return null;
        }
    }
    

    @PutMapping("/semestre")
    public Semestre putSemestre(@RequestBody Semestre semestre){
        try {
            Optional<Semestre> encontrado = semestreRepository.findById(semestre.getIdSemestre());
            Semestre semestreexistente = encontrado.get();
            semestreexistente.setNombre(semestre.getNombre());
            semestreexistente.setDescripcion(semestre.getDescripcion());
            semestreexistente.setCarrera(semestre.getCarrera());
            return semestreRepository.save(semestreexistente);
        }
        catch (Exception ex){
            return null;
        }
    }
}
