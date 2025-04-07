package com.forensys.forensys.controller;

import com.forensys.forensys.model.Laudo;
import com.forensys.forensys.repository.LaudoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/laudos")
public class LaudoController {

    @Autowired
    private LaudoRepository laudoRepository;

    @GetMapping
    public List<Laudo> listarTodos() {
        return laudoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Laudo> buscarPorId(@PathVariable Long id) {
        return laudoRepository.findById(id);
    }

    @PostMapping
    public Laudo criar(@RequestBody Laudo laudo) {
        return laudoRepository.save(laudo);
    }

    @PutMapping("/{id}")
    public Laudo atualizar(@PathVariable Long id, @RequestBody Laudo laudoAtualizado) {
        return laudoRepository.findById(id).map(laudo -> {
            laudo.setDescricao(laudoAtualizado.getDescricao());
            laudo.setDataEmissao(laudoAtualizado.getDataEmissao());
            laudo.setArquivo(laudoAtualizado.getArquivo());
            laudo.setPericia(laudoAtualizado.getPericia());
            return laudoRepository.save(laudo);
        }).orElseGet(() -> {
            laudoAtualizado.setId(id);
            return laudoRepository.save(laudoAtualizado);
        });
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        laudoRepository.deleteById(id);
    }
}
