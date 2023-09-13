package com.clinica.arequipa.controller;

import com.clinica.arequipa.dto.RequestPacienteDto;
import com.clinica.arequipa.dto.ResponsePacienteDto;
import com.clinica.arequipa.service.PacienteServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/paciente", headers = "X-API-VERSION=v1")
@Validated
@RequiredArgsConstructor
public class PacienteController {

    private final PacienteServiceImpl pacienteService;

    @PostMapping("/registrar")
    public HttpEntity<ResponsePacienteDto> registrarPaciente(@RequestHeader(name = "X-API-VERSION") String apiVersion,
                                                             @RequestHeader (name = "X-CORRELATION ID") String correlationId,
                                                             @RequestBody RequestPacienteDto requestPacienteDto){

        ResponsePacienteDto ResponsePacienteDto = this.pacienteService.registrarPacienteByDni(requestPacienteDto);

        return ResponseEntity.ok(ResponsePacienteDto);
    }

    @GetMapping("/consulta/{dni}")
    public HttpEntity<ResponsePacienteDto> consultaPaciente(@RequestHeader (name = "X-API-VERSION") String apiVersion,
                                                            @RequestHeader (name = "X-CORRELATION ID") String correlationId,
                                                            @PathVariable ("dni") final String dni){

        ResponsePacienteDto ResponsePacienteDto = this.pacienteService.consultaPacienteByPath(dni);

        return ResponseEntity.ok(ResponsePacienteDto);
    }

    @PutMapping("/actualizar")
    public HttpEntity<ResponsePacienteDto> actualizarPaciente(@RequestHeader (name = "X-API-VERSION") String apiVersion,
                                                            @RequestHeader (name = "X-CORRELATION ID") String correlationId,
                                                            @RequestBody RequestPacienteDto requestPacienteDto){

        ResponsePacienteDto ResponsePacienteDto = this.pacienteService.actualizarPaciente(requestPacienteDto);

        return ResponseEntity.ok(ResponsePacienteDto);
    }

}
