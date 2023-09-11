package com.clinica.arequipa.controller;

import com.clinica.arequipa.dto.RequestPacienteDto;
import com.clinica.arequipa.dto.ResponsePacienteDto;
import com.clinica.arequipa.service.PacienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping(value = "/paciente", headers = "X-API-VERSION=v1")
@Validated
@RequiredArgsConstructor
public class PacienteController {

    private final PacienteService pacienteService;

    @PostMapping("/registrar")
    public HttpEntity<ResponsePacienteDto> registrarPaciente(@RequestHeader(name = "X-API-VERSION") String apiVersion,
                                                             @RequestHeader (name = "X-CORRELATION ID") String correlationId,
                                                             @RequestBody RequestPacienteDto requestPacienteDto){

        this.pacienteService.registrarPacienteByDni(requestPacienteDto);

        return ResponseEntity.ok(null);
    }

    @GetMapping("/consulta")
    public HttpEntity<ResponsePacienteDto> consultaPaciente(@RequestHeader (name = "X-API-VERSION") String apiVersion,
                                                             @RequestHeader (name = "X-CORRELATION ID") String correlationId){

        return ResponseEntity.ok(null);
    }

    @PutMapping("/actualizar")
    public HttpEntity<ResponsePacienteDto> actualizarPaciente(@RequestHeader (name = "X-API-VERSION") String apiVersion,
                                                            @RequestHeader (name = "X-CORRELATION ID") String correlationId,
                                                            @RequestBody RequestPacienteDto requestPacienteDto){

        return ResponseEntity.ok(null);
    }

}
