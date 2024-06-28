package com.example.backend_sol_y_luna.domain.services;

import com.example.backend_sol_y_luna.domain.entities.Usuario;
import com.example.backend_sol_y_luna.domain.entities.UsuarioRol;

import java.util.Set;

public interface UsuarioService {

    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

    public Usuario obtenerUsuario(String username);

    public void eliminarUsuario(Long usuarioId);
}
