package com.example.lab3gtics.entidad;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "arbitro")
@Getter
@Setter
public class Arbitro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idArbitro")
    private Integer idarbitro;

    @Column(name = "nombre",nullable = false,length = 45)
    private String nombre;

    @Column(name = "pais",nullable = false,length = 45)
    private String pais;

}
