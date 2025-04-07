package com.forensys.forensys.repository;

import com.forensys.forensys.model.Suspeito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuspeitoRepository extends JpaRepository<Suspeito, Long> {

    
}
