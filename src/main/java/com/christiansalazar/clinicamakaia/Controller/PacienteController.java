package com.christiansalazar.clinicamakaia.Controller;
import com.christiansalazar.clinicamakaia.Modelo.Paciente;
import com.christiansalazar.clinicamakaia.Service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class PacienteController {

    private PacienteService pacienteService;
    @Autowired
    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @PostMapping("pacientes")
    public Paciente crearOdontologo(@RequestBody Paciente paciente) {
        return pacienteService.crearPaciente(paciente);
    }

}
