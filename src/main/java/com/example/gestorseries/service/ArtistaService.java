package com.example.gestorseries.service;

import com.example.gestorseries.dtos.ArtistaDTO;
import com.example.gestorseries.model.Artista;

import java.util.List;

public interface ArtistaService {
    ArtistaDTO crear(Artista artista);
    ArtistaDTO obtenerPorId(Long id);
    List<ArtistaDTO> listar();
    void eliminar(Long id);

}
