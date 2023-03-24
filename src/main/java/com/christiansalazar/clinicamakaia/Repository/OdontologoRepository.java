package com.christiansalazar.clinicamakaia.Repository;

import com.christiansalazar.clinicamakaia.Modelo.Odontologo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OdontologoRepository extends CrudRepository<Odontologo, Integer> {

}
