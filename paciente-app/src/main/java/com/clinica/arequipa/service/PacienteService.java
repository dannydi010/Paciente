package com.clinica.arequipa.service;

import com.clinica.arequipa.dto.RequestPacienteDto;
import com.clinica.arequipa.dto.ResponsePacienteDto;

public interface PacienteService {

    ResponsePacienteDto registrarPacienteByDni(RequestPacienteDto requestPacienteDto);

    ResponsePacienteDto consultaPacienteByPath(String dni);

    ResponsePacienteDto actualizarPaciente(RequestPacienteDto requestPacienteDto);
}
