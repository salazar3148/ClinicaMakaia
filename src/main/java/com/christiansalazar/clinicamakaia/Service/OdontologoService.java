package com.christiansalazar.clinicamakaia.Service;

import com.christiansalazar.clinicamakaia.Modelo.Odontologo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.christiansalazar.clinicamakaia.Repository.OdontologoRepository;


@Service
public class OdontologoService {

    private OdontologoRepository odontologoRepository;

    @Autowired
    public OdontologoService(OdontologoRepository odontologoRepository) {
        this.odontologoRepository = odontologoRepository;
    }

    public Odontologo nuevoOdontologo(Odontologo odontologo) {
        this.odontologoRepository.save(odontologo);
        return odontologo;
    }
}
