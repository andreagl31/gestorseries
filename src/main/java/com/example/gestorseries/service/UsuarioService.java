package com.example.gestorseries.service;

import com.example.gestorseries.dtos.UsuarioDTO;
import com.example.gestorseries.model.Usuario;

import java.util.List;

public interface UsuarioService {
    UsuarioDTO crear (Usuario usuario);
    UsuarioDTO obtenerPorId (Long id);
    List<UsuarioDTO> listar ();
    void eliminar(Long id);

}
