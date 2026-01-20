package com.example.gestorseries.service;

import com.example.gestorseries.dtos.PlaylistDTO;
import com.example.gestorseries.model.Playlist;

import java.util.List;

public interface PlaylistService {
    PlaylistDTO crear(Playlist playlist);
    PlaylistDTO obtenerPorId(Long id);
    List<PlaylistDTO> listar();
    void eliminar(Long id);
    void añadirCancion(Long playlistId, Long cancionId);
}
