package com.example.gestorseries.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name= "albumes")
public class Album {
    @Id
    @GeneratedValue
    private Long id;
    private String titulo;
    private String genero;
    private LocalDate fechaLanzamiento;
    private String portadaUrl;

    //Un albúm tiene muchas canciones
    @OneToMany(
            mappedBy="album",
            cascade= CascadeType.ALL,
            orphanRemoval = true

    )
    private List<Cancion> canciones;
}
