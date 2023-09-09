package com.todocodeacademy.pacientes.controller;


import com.todocodeacademy.pacientes.domain.Paciente;
import com.todocodeacademy.pacientes.service.IPacienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pacientes")
public class PacientesController {

    IPacienteService pacienteService;
    public PacientesController(IPacienteService pacienteService){
        this.pacienteService = pacienteService;
    }

    @GetMapping( path = "/all")
    public List<Paciente> getAllPacientes(){
         List<Paciente> pacientes = pacienteService.getPacientes();
        return pacientes;
    }
    @GetMapping( path = "/{id}")
    public Paciente getPacienteById(@PathVariable( name = "id") Long id){
        return pacienteService.findById(id);
    }

    @DeleteMapping( path = "/{id}")
    public String deletePaciente(@PathVariable(name = "id") Long id){
        if(pacienteService.deletePaciente(id)){
            return "El paciente: " + id + " fue eliminado exitosamente.";
        }
        return "El paciente: " + id + " no existe.";
    }

    @PostMapping( path = "/save" )
    public String savePaciente(@RequestBody Paciente paciente){
        pacienteService.savePaciente(paciente);
        return "El paciente fue creado con exito.";
    }

    @PutMapping( path = "/update/{id}" )
    public String updatePaciente(@PathVariable( name = "id") Long id, @RequestBody Paciente paciente) {
        if(pacienteService.updatePaciente(id, paciente)){
            return "El paciente: " + id + " fue actualizado exitosamente.";
        }
        return "El paciente: " + id + " no existe";
    }
}
