package com.forensys.forensys.controller;

import com.forensys.forensys.model.Pericia;
import com.forensys.forensys.repository.PericiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pericias")
public class PericiaController {

    @Autowired
    private PericiaRepository periciaRepository;

    @GetMapping
    public List<Pericia> listarTodas() {
        return periciaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Pericia> buscarPorId(@PathVariable Long id) {
        return periciaRepository.findById(id);
    }

    @PostMapping
    public Pericia criar(@RequestBody Pericia pericia) {
        return periciaRepository.save(pericia);
    }

    @PutMapping("/{id}")
    public Pericia atualizar(@PathVariable Long id, @RequestBody Pericia periciaAtualizada) {
        return periciaRepository.findById(id).map(pericia -> {
            pericia.setTipo(periciaAtualizada.getTipo());
            pericia.setDescricao(periciaAtualizada.getDescricao());
            pericia.setData(periciaAtualizada.getData());
            pericia.setOcorrencia(periciaAtualizada.getOcorrencia());
            return periciaRepository.save(pericia);
        }).orElseGet(() -> {
            periciaAtualizada.setId(id);
            return periciaRepository.save(periciaAtualizada);
        });
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        periciaRepository.deleteById(id);
    }
}
