package com.paulruiz.springB.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name= "ROL")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol")
    private Integer idRol;

    @Column(name = "Nombre", length =100)
    private String nombre;

    @Column(name = "Descripcion", length =600)
    private String descripcion;

    @Column(name = "Permisos", length =10)
    private String permisos;

}
