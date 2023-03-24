package com.christiansalazar.clinicamakaia.Controller;

import com.christiansalazar.clinicamakaia.Modelo.Cita;
import com.christiansalazar.clinicamakaia.Service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class CitaController {

    private CitaService citaService;

    @Autowired
    public CitaController(CitaService citaService) {
        this.citaService = citaService;
    }

    @PostMapping("odontologos/{matriculaOdontologo}/pacientes/{dniPaciente}/fecha/{fecha}/asignar")
    public ResponseEntity<Cita> asignarTurno(@PathVariable Integer matriculaOdontologo, @PathVariable Long dniPaciente, @PathVariable String fecha){
        Cita cita = citaService.generarCita(matriculaOdontologo, dniPaciente, fecha);
        if(cita == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(cita);
    }
}
