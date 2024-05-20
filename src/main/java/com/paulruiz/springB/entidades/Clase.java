package com.paulruiz.springB.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name= "CLASE")
public class Clase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_clase")
    private Integer idClase;

    @Column(name = "Nombre", length = 120)
    private String nombre;

    @Column(name = "Descripcion", length = 600)
    private String descripcion;

    @Column(name = "orden")
    private Integer orden;

    @Column(name = "video", length = 255)
    private String video;

    @Column(name = "pdf", length = 255)
    private String pdf;

    @Column(name = "link", length = 255)
    private String link;

    @Column(name = "visible"  )
    private Boolean visible;

    @ManyToOne
    @JoinColumn(name = "id_materia")
    private Materia materia;

}
