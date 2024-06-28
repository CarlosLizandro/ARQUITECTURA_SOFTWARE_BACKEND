package com.example.backend_sol_y_luna.domain.repositories;

import com.example.backend_sol_y_luna.domain.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    public Usuario findByUsername(String username);

}
