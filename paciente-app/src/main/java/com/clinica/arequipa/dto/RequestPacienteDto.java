package com.clinica.arequipa.dto;

import lombok.*;

import java.io.Serializable;
@Data
public class RequestPacienteDto implements Serializable {

    private static final long serialVersionUID = 1234567812345678L;

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
