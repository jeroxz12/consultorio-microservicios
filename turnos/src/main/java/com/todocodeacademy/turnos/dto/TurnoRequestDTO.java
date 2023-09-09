package com.todocodeacademy.turnos.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class TurnoRequestDTO {

    private LocalDate fecha;

    private String motivo;

    private String dniPaciente;

}
