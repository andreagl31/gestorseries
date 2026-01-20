package com.example.gestorseries.service;

import com.example.gestorseries.dtos.AlbumDTO;
import com.example.gestorseries.model.Album;

import java.util.List;
//Por seguridad en vez devolver la entidad directamente
//devuelvo el dto para no tocar la base de datos directamente
//es repositorio, te devuele la entidad y lo pasas a dto para devolverselo al controller solo

public interface AlbumService {
    AlbumDTO crear(Album album);
    AlbumDTO obtenerPorId(Long id);
    List<AlbumDTO> listar();
    void eliminar(Long id);


}
