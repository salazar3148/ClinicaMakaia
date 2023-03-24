package com.christiansalazar.clinicamakaia.Repository;

import com.christiansalazar.clinicamakaia.Modelo.Cita;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitaRepository extends CrudRepository<Cita, Integer> {
}
