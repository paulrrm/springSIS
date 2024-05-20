package com.paulruiz.springB.entidades;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name= "PERIODO")
public class Periodo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_periodo")
    private Integer idPeriodo;

    @Column(name = "Nombre", length =100)
    private String nombre;

    @Column(name = "Descripcion", length =600)
    private String descripcion;

    @Column(name = "Desde")
    private Date desde;

    @Column(name = "Hasta")
    private Date hasta;
}
