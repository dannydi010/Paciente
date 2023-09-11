package com.clinica.arequipa.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResponsePacienteDto implements Serializable {

    private static final long serialVersionUID = 1234567812755678L;

    private String fullName;

    private String name;

    private String lastName;

    private String secondName;

    private String state;

}
