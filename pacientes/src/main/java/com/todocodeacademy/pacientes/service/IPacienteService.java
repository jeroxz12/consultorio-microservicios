package com.todocodeacademy.pacientes.service;

import com.todocodeacademy.pacientes.domain.Paciente;

import java.util.List;

public interface IPacienteService {
    public List<Paciente> getPacientes();

    public void savePaciente(Paciente pac);

    public boolean deletePaciente(Long idPaciente);

    public boolean updatePaciente(Long idPaciente, Paciente paciente);

    public Paciente findById(Long idPaciente);
}
