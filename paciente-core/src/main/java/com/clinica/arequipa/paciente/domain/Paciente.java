package com.clinica.arequipa.paciente.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Paciente {
    private String dni;

    private String state;

    private String phone;

    private String ubigeo;

    private String ubigeoSunat;

    private String fullName;

    private String name;

    private String lastName;

    private String secondName;
}
