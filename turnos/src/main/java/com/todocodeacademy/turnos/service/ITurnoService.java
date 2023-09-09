package com.todocodeacademy.turnos.service;

import com.todocodeacademy.turnos.domain.Turno;
import com.todocodeacademy.turnos.dto.TurnoRequestDTO;

import java.util.List;

public interface ITurnoService {

    public List<Turno> getTurnos();

    public void saveTurno(TurnoRequestDTO turnoRequestDTO);

    public boolean deleteTurno(Long idTurno);

    public boolean updateTurno(Long idTurno, Turno Turno);

    public Turno findById(Long idTurno);

}
