package com.clinica.arequipa.service;

import com.clinica.arequipa.dto.RequestPacienteDto;
import com.clinica.arequipa.dto.ResponsePacienteDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class PacienteServiceImpl implements PacienteService {

    public ResponsePacienteDto registrarPacienteByDni(RequestPacienteDto requestPacienteDto) {

        return null;
    }

    public ResponsePacienteDto consultaPacienteByPath(String dni) {

        return null;
    }

    public ResponsePacienteDto actualizarPaciente(RequestPacienteDto requestPacienteDto) {

        return null;
    }
}
