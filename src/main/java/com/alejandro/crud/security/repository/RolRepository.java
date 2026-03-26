package com.alejandro.crud.security.repository;

import com.alejandro.crud.security.entity.Rol;
import com.alejandro.crud.security.enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RolRepository extends JpaRepository<Rol, Integer > {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    boolean existsByRolNombre(RolNombre rolNombre);
}
