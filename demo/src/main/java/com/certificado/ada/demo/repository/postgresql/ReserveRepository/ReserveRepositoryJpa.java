package com.certificado.ada.demo.repository.postgresql.ReserveRepository;

import com.certificado.ada.demo.model.Reserve;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReserveRepositoryJpa extends JpaRepository<Reserve, Long> {
}
