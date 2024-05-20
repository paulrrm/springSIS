package com.paulruiz.springB.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name= "CALIFICACION")
public class Calificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_calificacion")
    private Integer idCalificacion;
    @Column(name = "Descripcion", length = 1000)
    private String descripcion;
    @Column(name = "NombrePdf", length = 500)
    private String nombrePdf;
    @Column(name = "Nota")
    private Double nota;
    @Column(name = "Observacion", length = 500)
    private String observacion;


    @ManyToOne
    @JoinColumn(name = "id_materia")
    private Materia materia;

    @ManyToOne
    @JoinColumn(name = "id_matricula")
    private Matricula matricula;


}
