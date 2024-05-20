package com.paulruiz.springB.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name= "CARRERA")
public class Carrera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carrera")
    private Integer idCarrera;

    @Column(name = "Nombre", length = 200)
    private String nombre;

    @Column(name = "Descripcion", length = 600)
    private String descripcion;

}
