package com.example.lab3gtics.entidad;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "estadio")
@Getter
@Setter
public class Estadio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEstadio")
    private Integer idestadio;

    @Column(name = "nombre",nullable = false,length = 45)
    private String nombre;

    @Column(name = "provincia",nullable = false,length = 45)
    private String provincia;

    @Column(name = "club",length = 45)
    private String club;


}
