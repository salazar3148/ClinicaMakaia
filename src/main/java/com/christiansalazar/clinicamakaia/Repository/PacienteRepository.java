package com.christiansalazar.clinicamakaia.Repository;

import com.christiansalazar.clinicamakaia.Modelo.Paciente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends CrudRepository<Paciente, Long> {
}
