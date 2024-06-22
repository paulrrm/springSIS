package com.paulruiz.springB.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name= "USUARIO")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Column(name = "Nombre", length = 200)
    private String nombre;

    @Column(name = "Direccion" , length =200)
    private String direccion;

    @Column(name = "Correo",  length =255)
    private String correo;

    @Column(name = "Cedula", length =15 , unique = true)
    private String cedula;

    @Column(name = "Telefono", length =30)
    private String telefono;

    @Column(name = "Clave", length =40)
    private String clave;

    @ManyToOne
    @JoinColumn(name = "id_rol")
    private Rol rol;
}
