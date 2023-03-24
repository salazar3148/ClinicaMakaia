package com.christiansalazar.clinicamakaia.Service;

import com.christiansalazar.clinicamakaia.Modelo.Cita;
import com.christiansalazar.clinicamakaia.Modelo.Odontologo;
import com.christiansalazar.clinicamakaia.Modelo.Paciente;
import com.christiansalazar.clinicamakaia.Repository.CitaRepository;
import com.christiansalazar.clinicamakaia.Repository.OdontologoRepository;
import com.christiansalazar.clinicamakaia.Repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CitaService {

    private CitaRepository citaRepository;
    private PacienteRepository pacienteRepository;
    private OdontologoRepository odontologoRepository;

    @Autowired
    public CitaService(CitaRepository citaRepository, PacienteRepository pacienteRepository, OdontologoRepository odontologoRepository) {
        this.citaRepository = citaRepository;
        this.pacienteRepository = pacienteRepository;
        this.odontologoRepository = odontologoRepository;
    }

    public Cita generarCita(Integer matricula, Long dni, String fecha){
        if(dni < 0 || matricula < 0 || fecha == null){
            throw new RuntimeException("Valores invalidos");
        }

        Optional<Odontologo> odontologo = this.odontologoRepository.findById(matricula);
        Optional<Paciente> paciente = this.pacienteRepository.findById(dni);

        if(odontologo.isPresent() && paciente.isPresent()){
            Cita cita = new Cita(odontologo.get(), paciente.get(), fecha);
            this.citaRepository.save(cita);
            return cita;
        }
        return null;
    }
}
