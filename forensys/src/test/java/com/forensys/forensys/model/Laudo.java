package com.forensys.forensys.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Laudo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pericia_id")
    private Pericia pericia;

    @Column(columnDefinition = "TEXT")
    private String descricao;

    private LocalDate dataEmissao;

    private String arquivo; // URL ou caminho do arquivo PDF

    public Laudo() {}

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Pericia getPericia() { return pericia; }
    public void setPericia(Pericia pericia) { this.pericia = pericia; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public LocalDate getDataEmissao() { return dataEmissao; }
    public void setDataEmissao(LocalDate dataEmissao) { this.dataEmissao = dataEmissao; }

    public String getArquivo() { return arquivo; }
    public void setArquivo(String arquivo) { this.arquivo = arquivo; }
}
