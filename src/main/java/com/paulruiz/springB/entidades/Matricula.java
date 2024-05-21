package com.paulruiz.springB.entidades;


import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.sql.Time;



@Data
@Entity
@Table(name= "MATRICULA")
public class Matricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_matricula")
    private Integer idMatricula;
    @Column(name = "fecha")
    private Date fecha;
    @Column(name = "activo")
    private Boolean activo;
    @Column(name = "hora")
    private Time hora;


    @ManyToOne
    @JoinColumn(name = "id_periodo")
    private Periodo periodo;
    @ManyToOne
    @JoinColumn(name = "id_semestre")
    private Semestre semestre;
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;


}
