package com.christiansalazar.clinicamakaia.Controller;

import com.christiansalazar.clinicamakaia.Modelo.Odontologo;
import com.christiansalazar.clinicamakaia.Service.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class OdontologoController {
    OdontologoService odontologoService;

    @Autowired
    public OdontologoController(OdontologoService odontologoService) {
        this.odontologoService = odontologoService;
    }

    @PostMapping("odontologos")
    public Odontologo crearOdontologo(@RequestBody Odontologo odontologo) {
        return odontologoService.nuevoOdontologo(odontologo);
    }

}
