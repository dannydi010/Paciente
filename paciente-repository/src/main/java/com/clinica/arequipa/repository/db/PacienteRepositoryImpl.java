package com.clinica.arequipa.repository.db;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
@RequiredArgsConstructor
public class PacienteRepositoryImpl implements PacienteRepository {

    private final JdbcTemplate jdbcTemplate;

    private static final String FIND_PATIENT_BY_DNI = "{call find_patient_by_dni}";

}
