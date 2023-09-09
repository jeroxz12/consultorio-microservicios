package com.todocodeacademy.turnos.service.impl;

import com.todocodeacademy.turnos.domain.Turno;
import com.todocodeacademy.turnos.dto.TurnoRequestDTO;
import com.todocodeacademy.turnos.repository.ITurnoRepository;
import com.todocodeacademy.turnos.service.ITurnoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurnoServiceImpl implements ITurnoService {

    ITurnoRepository turnoRepository;

    public TurnoServiceImpl(ITurnoRepository turnoRepository) {
        this.turnoRepository = turnoRepository;
    }

    @Override
    public List<Turno> getTurnos() {
        return turnoRepository.findAll();
    }

    @Override
    public void saveTurno(TurnoRequestDTO turnoRequestDTO) {
        Turno turnoToSave = new Turno();

        turnoToSave.setFecha(turnoRequestDTO.getFecha());
        turnoToSave.setMotivo(turnoRequestDTO.getMotivo());

        turnoRepository.save(turnoToSave);
    }

    @Override
    public boolean deleteTurno(Long idTurno) {
        return false;
    }

    @Override
    public boolean updateTurno(Long idTurno, Turno Turno) {
        return false;
    }

    @Override
    public Turno findById(Long idTurno) {
        return null;
    }
}
