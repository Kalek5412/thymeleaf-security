package com.alejandro.crud.security.config;

import com.alejandro.crud.security.entity.Rol;
import com.alejandro.crud.security.enums.RolNombre;
import com.alejandro.crud.security.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class CreateRoles implements CommandLineRunner {

    @Autowired
    private RolService rolService;

    @Override
    public void run(String... args) throws Exception {
        for (RolNombre rolNombre : RolNombre.values()) {
            if (!rolService.existsByRolNombre(rolNombre)) {
                Rol rol = new Rol(rolNombre);
                rolService.save(rol);
                System.out.println("Rol creado: " + rolNombre);
            }
        }
    }
}