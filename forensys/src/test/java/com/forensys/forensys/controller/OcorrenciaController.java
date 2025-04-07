package com.forensys.forensys.controller;

import com.forensys.forensys.model.Ocorrencia;
import com.forensys.forensys.repository.OcorrenciaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ocorrencias")
public class OcorrenciaController {

    private final OcorrenciaRepository repository;

    public OcorrenciaController(OcorrenciaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Ocorrencia> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Ocorrencia salvar(@RequestBody Ocorrencia ocorrencia) {
        return repository.save(ocorrencia);
    }
}