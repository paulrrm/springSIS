package com.paulruiz.springB.controladores;


import com.paulruiz.springB.entidades.Calificacion;
import com.paulruiz.springB.entidades.Carrera;
import com.paulruiz.springB.entidades.Clase;
import com.paulruiz.springB.entidades.Materia;
import com.paulruiz.springB.entidades.Rol;
import com.paulruiz.springB.entidades.Semestre;
import com.paulruiz.springB.entidades.Tarea;
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
    /////////////////////////
    @GetMapping("/materia")
    public List<Materia> getMateria(){
        return materiaRepository.findAll();
    }
    @PostMapping("/materia")
    public Materia postSemestre(@RequestBody Materia materia){
        return materiaRepository.save(materia);
    }
    @DeleteMapping("/materia/{id}")
    public Materia deleteMatera(@PathVariable Integer id){
        try {
            Optional<Materia> encontrado = materiaRepository.findById(id);
            materiaRepository.delete(encontrado.get());
            return encontrado.get();
        }
        catch (Exception ex){
             return null;
        }
    }
    

    @PutMapping("/materia")
    public Materia putMateria(@RequestBody Materia materia){
        try {
            Optional<Materia> encontrado = materiaRepository.findById(materia.getIdMateria());
            Materia materiaexistente = encontrado.get();
            materiaexistente.setNombre(materia.getNombre());
            materiaexistente.setDescripcion(materia.getDescripcion());
            
            return materiaRepository.save(materiaexistente);
        }
        catch (Exception ex){
            return null;
        }
    }
    /////////////////////////
    @GetMapping("/clase")
    public List<Clase> getClase(){
        return claseRepository.findAll();
    }
    @PostMapping("/clase")
    public Clase postClase(@RequestBody Clase clase){
        return claseRepository.save(clase);
    }
    @DeleteMapping("/clase/{id}")
    public Clase deletClase(@PathVariable Integer id){
        try {
            Optional<Clase> encontrado = claseRepository.findById(id);
            claseRepository.delete(encontrado.get());
            return encontrado.get();
        }
        catch (Exception ex){
             return null;
        }
    }
    

    @PutMapping("/clase")
    public Clase putClase(@RequestBody Clase clase){
        try {
            Optional<Clase> encontrado = claseRepository.findById(clase.getIdClase());
            Clase claseexistente = encontrado.get();
            claseexistente.setNombre(clase.getNombre());
            claseexistente.setDescripcion(clase.getDescripcion());
            claseexistente.setLink(clase.getLink());
            claseexistente.setOrden(clase.getOrden());
            claseexistente.setPdf(clase.getPdf());
            claseexistente.setVideo(clase.getVideo());
            claseexistente.setVisible(clase.getVisible());
            return claseRepository.save(claseexistente);
        }
        catch (Exception ex){
            return null;
        }
    }
    /////////////////////////
    @GetMapping("/tarea")
    public List<Tarea> getTarea(){
        return tareaRepository.findAll();
    }
    @PostMapping("/tarea")
    public Tarea postTarea(@RequestBody Tarea tarea){
        return tareaRepository.save(tarea);
    }
    @DeleteMapping("/tarea/{id}")
    public Tarea deletTarea(@PathVariable Integer id){
        try {
            Optional<Tarea> encontrado = tareaRepository.findById(id);
            tareaRepository.delete(encontrado.get());
            return encontrado.get();
        }
        catch (Exception ex){
             return null;
        }
    }
    

    @PutMapping("/tarea")
    public Tarea putTarea(@RequestBody Tarea tarea){
        try {
            Optional<Tarea> encontrado = tareaRepository.findById(tarea.getIdTarea());
            Tarea tareaexistente = encontrado.get();
            tareaexistente.setNombre(tarea.getNombre());
            tareaexistente.setDescripcion(tarea.getDescripcion());
            tareaexistente.setPonderacion(tarea.getPonderacion());
            return tareaRepository.save(tareaexistente);
        }
        catch (Exception ex){
            return null;
        }
    }
    /////////////////////////
    @GetMapping("/calificacion")
    public List<Calificacion> getCalificacion(){
        return calificacionRepository.findAll();
    }
    @PostMapping("/calificacion")
    public Calificacion postCalificacion(@RequestBody Calificacion calificacion){
        return calificacionRepository.save(calificacion);
    }
    @DeleteMapping("/calificacion/{id}")
    public Calificacion deletCalificacion(@PathVariable Integer id){
        try {
            Optional<Calificacion> encontrado = calificacionRepository.findById(id);
            calificacionRepository.delete(encontrado.get());
            return encontrado.get();
        }
        catch (Exception ex){
             return null;
        }
    }
    

    @PutMapping("/calificacion")
    public Calificacion putCalificacion(@RequestBody Calificacion calificacion){
        try {
            Optional<Calificacion> encontrado = calificacionRepository.findById(calificacion.getIdCalificacion());
            Calificacion calificacionexistente = encontrado.get();
            calificacionexistente.setNombrePdf(calificacion.getNombrePdf());
            calificacionexistente.setDescripcion(calificacion.getDescripcion());
            calificacionexistente.setNombrePdf(calificacion.getNombrePdf());
            calificacionexistente.setNota(calificacion.getNota());
            calificacionexistente.(calificacion.getNota());
            return calificacionRepository.save(calificacionexistente);
        }
        catch (Exception ex){
            return null;
        }
    }
}
