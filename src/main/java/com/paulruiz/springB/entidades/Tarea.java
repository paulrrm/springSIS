package com.paulruiz.springB.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name= "TAREA")
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tarea")
    private Integer idTarea;

    @Column(name = "Nombre", length =300)
    private String nombre;

    @Column(name = "Descripcion", length =600)
    private String descripcion;

    @Column(name = "ponderacion")
    private Integer ponderacion;

    @ManyToOne
    @JoinColumn(name = "id_materia")
    private Materia materia;
}
