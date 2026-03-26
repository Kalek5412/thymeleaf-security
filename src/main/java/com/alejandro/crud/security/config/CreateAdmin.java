package com.alejandro.crud.security.config;

import com.alejandro.crud.security.entity.Rol;
import com.alejandro.crud.security.entity.Usuario;
import com.alejandro.crud.security.enums.RolNombre;
import com.alejandro.crud.security.service.RolService;
import com.alejandro.crud.security.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CreateAdmin implements CommandLineRunner {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private RolService rolService;

    @Override
    public void run(String... args) throws Exception {
//        Usuario usuario = new Usuario();
//        String passwordEncoded = passwordEncoder.encode("admin");
//        usuario.setNombreUsuario("admin");
//        usuario.setPassword(passwordEncoded);
//        Rol rolAdmin = rolService.getByRolNombre(RolNombre.ROLE_ADMIN).get();
//        Rol rolUser = rolService.getByRolNombre(RolNombre.ROLE_USER).get();
//        Set<Rol> roles = new HashSet<>();
//        roles.add(rolAdmin);
//        roles.add(rolUser);
//        usuario.setRoles(roles);
//        usuarioService.save(usuario);
    }
}
