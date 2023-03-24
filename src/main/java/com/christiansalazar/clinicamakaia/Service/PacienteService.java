package com.christiansalazar.clinicamakaia.Service;

import com.christiansalazar.clinicamakaia.Modelo.Paciente;
import com.christiansalazar.clinicamakaia.Repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class PacienteService {
    private PacienteRepository pacienteRepository;

    @Autowired
    public PacienteService(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    public Paciente crearPaciente(Paciente paciente) {
        if(paciente.getDni() > 0 && paciente.getNombre() == null){
            throw new RuntimeException("No puede tener nombre vacio, o DNI Negativo");
        }
        this.pacienteRepository.save(paciente);
        return paciente;
    }
}
