package com.forensys.forensys.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "historico_atividades")
public class HistoricoAtividades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @Column(nullable = false)
    private String acao;

    @Column(nullable = false)
    private LocalDateTime data;

    @Column(columnDefinition = "TEXT")
    private String detalhes;

    // Construtores
    public HistoricoAtividades() {}

    public HistoricoAtividades(Usuario usuario, String acao, String detalhes) {
        this.usuario = usuario;
        this.acao = acao;
        this.detalhes = detalhes;
        this.data = LocalDateTime.now();
    }

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }
}
