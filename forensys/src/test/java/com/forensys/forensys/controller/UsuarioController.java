package com.forensys.forensys.controller;

import com.forensys.forensys.dto.UsuarioDTO;
import com.forensys.forensys.model.Usuario;
import com.forensys.forensys.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    // ✅ Recebe DTO, não a entidade
    @PostMapping
    public ResponseEntity<Usuario> cadastrar(@RequestBody @Valid UsuarioDTO dto) {
        Usuario usuarioCriado = usuarioService.cadastrarUsuario(dto);
        return ResponseEntity.ok(usuarioCriado);
    }

    // ✅ Lista todos os usuários e converte para DTO se quiser
    @GetMapping
    public ResponseEntity<List<UsuarioDTO>> listar() {
        List<UsuarioDTO> usuarios = usuarioService.listarUsuarios()
                .stream()
                .map(usuario -> new UsuarioDTO(
                        usuario.getNome(),
                        usuario.getEmail(),
                        usuario.getSenha(),
                        usuario.getCargo(),
                        usuario.getRegistroProfissional()))
                .collect(Collectors.toList());

        return ResponseEntity.ok(usuarios);
    }
}
