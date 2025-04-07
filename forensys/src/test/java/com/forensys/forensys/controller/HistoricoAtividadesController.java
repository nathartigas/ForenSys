package com.forensys.forensys.controller;

import com.forensys.forensys.model.HistoricoAtividades;
import com.forensys.forensys.repository.HistoricoAtividadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/historico")
public class HistoricoAtividadesController {

    @Autowired
    private HistoricoAtividadesRepository historicoRepository;

    @GetMapping
    public List<HistoricoAtividades> listarTudo() {
        return historicoRepository.findAll();
    }

    @GetMapping("/usuario/{usuarioId}")
    public List<HistoricoAtividades> listarPorUsuario(@PathVariable Long usuarioId) {
        return historicoRepository.findByUsuarioId(usuarioId);
    }

    @PostMapping
    public HistoricoAtividades registrarAtividade(@RequestBody HistoricoAtividades atividade) {
        return historicoRepository.save(atividade);
    }
}
