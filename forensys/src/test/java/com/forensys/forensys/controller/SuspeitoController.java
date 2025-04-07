package com.forensys.forensys.controller;

import com.forensys.forensys.model.Suspeito;
import com.forensys.forensys.repository.SuspeitoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/suspeitos")
public class SuspeitoController {

    @Autowired
    private SuspeitoRepository suspeitoRepository;

    @GetMapping
    public List<Suspeito> listarTodos() {
        return suspeitoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Suspeito> buscarPorId(@PathVariable Long id) {
        return suspeitoRepository.findById(id);
    }

    @PostMapping
    public Suspeito criar(@RequestBody Suspeito suspeito) {
        return suspeitoRepository.save(suspeito);
    }

    @PutMapping("/{id}")
    public Suspeito atualizar(@PathVariable Long id, @RequestBody Suspeito suspeitoAtualizado) {
        return suspeitoRepository.findById(id).map(suspeito -> {
            suspeito.setNome(suspeitoAtualizado.getNome());
            suspeito.setCpf(suspeitoAtualizado.getCpf());
            suspeito.setEndereco(suspeitoAtualizado.getEndereco());
            suspeito.setTelefone(suspeitoAtualizado.getTelefone());
            return suspeitoRepository.save(suspeito);
        }).orElseGet(() -> {
            suspeitoAtualizado.setId(id);
            return suspeitoRepository.save(suspeitoAtualizado);
        });
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        suspeitoRepository.deleteById(id);
    }
}
