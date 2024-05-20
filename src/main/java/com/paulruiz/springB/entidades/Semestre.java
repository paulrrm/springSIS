package com.paulruiz.springB.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name= "SEMESTRE")
public class Semestre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_semestre")
    private Integer idSemestre;

    @Column(name = "Nombre", length =120)
    private String nombre;

    @Column(name = "Descripcion", length = 600)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "id_carrera")
    private Carrera carrera;
}
