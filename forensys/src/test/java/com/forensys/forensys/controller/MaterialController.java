package com.forensys.forensys.controller;

import com.forensys.forensys.model.Material;
import com.forensys.forensys.repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/materiais")
public class MaterialController {

    @Autowired
    private MaterialRepository materialRepository;

    @GetMapping
    public List<Material> listarTodos() {
        return materialRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Material> buscarPorId(@PathVariable Long id) {
        return materialRepository.findById(id);
    }

    @PostMapping
    public Material criar(@RequestBody Material material) {
        return materialRepository.save(material);
    }

    @PutMapping("/{id}")
    public Material atualizar(@PathVariable Long id, @RequestBody Material materialAtualizado) {
        return materialRepository.findById(id).map(material -> {
            material.setTipo(materialAtualizado.getTipo());
            material.setDescricao(materialAtualizado.getDescricao());
            material.setLocalColeta(materialAtualizado.getLocalColeta());
            material.setDataColeta(materialAtualizado.getDataColeta());
            material.setArmazenamento(materialAtualizado.getArmazenamento());
            material.setOcorrencia(materialAtualizado.getOcorrencia());
            return materialRepository.save(material);
        }).orElseGet(() -> {
            materialAtualizado.setId(id);
            return materialRepository.save(materialAtualizado);
        });
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        materialRepository.deleteById(id);
    }
}
