package com.forensys.forensys.repository;

import com.forensys.forensys.model.HistoricoAtividades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HistoricoAtividadesRepository extends JpaRepository<HistoricoAtividades, Long> {
    List<HistoricoAtividades> findByUsuarioId(Long usuarioId);
}

