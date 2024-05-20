package com.paulruiz.springB.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name= "MATERIA")
public class Materia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_materia")
    private Integer idMateria;

    @Column(name = "Nombre", length = 120)
    private String nombre;

    @Column(name = "Descripcion", length = 500)
    private String descripcion;


    @ManyToOne
    @JoinColumn(name = "id_semestre")
    private Semestre semestre;
}
