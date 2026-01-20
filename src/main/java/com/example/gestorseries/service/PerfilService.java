package com.example.gestorseries.service;

import com.example.gestorseries.dtos.PerfilDTO;
import com.example.gestorseries.model.Perfil;

import java.util.List;

public interface PerfilService {
    PerfilDTO crear(Perfil perfil);
    PerfilDTO obtenerPorId(Long id);
    List<PerfilDTO> listar();
    void eliminar(Long id);
}
