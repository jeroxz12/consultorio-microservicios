package com.todocodeacademy.turnos.repository;

import com.todocodeacademy.turnos.domain.Turno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITurnoRepository extends JpaRepository<Turno, Long> {
}
