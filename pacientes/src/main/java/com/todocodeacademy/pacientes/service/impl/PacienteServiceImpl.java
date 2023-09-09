package com.todocodeacademy.pacientes.service.impl;

import com.todocodeacademy.pacientes.domain.Paciente;
import com.todocodeacademy.pacientes.repository.IPacienteRepository;
import com.todocodeacademy.pacientes.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteServiceImpl implements IPacienteService {
    IPacienteRepository pacienteRepository;

    public PacienteServiceImpl(IPacienteRepository pacienteRepository){
        this.pacienteRepository = pacienteRepository;
    }

    @Override
    public List<Paciente> getPacientes() {
        return pacienteRepository.findAll();
    }

    @Override
    public void savePaciente(Paciente paciente) {
        pacienteRepository.save(paciente);
    }

    @Override
    public boolean deletePaciente(Long idPaciente) {
        Paciente paciente = pacienteRepository.findById(idPaciente).orElse(null);
        if( paciente != null){
            pacienteRepository.deleteById(idPaciente);
            return true;
        }
        return false;
    }

    @Override
    public boolean  updatePaciente(Long idPaciente, Paciente paciente) {
        if( pacienteRepository.findById(idPaciente).isPresent() ) {
            this.savePaciente(paciente);
            return true;
        }
        return false;
    }

    @Override
    public Paciente findById(Long idPaciente) {
        return pacienteRepository.findById(idPaciente).orElse(null);
    }
}
