package com.christiansalazar.clinicamakaia.Modelo;

import javax.persistence.*;

@Entity
@Table(name="CITAS")
public class Cita {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne
    @JoinColumn(name="MATRICULA_DOCTOR")
    private Odontologo odontologo;

    @OneToOne
    @JoinColumn(name="DNI_PACIENTE")
    private Paciente paciente;

    @Column(name="FECHA")
    private String fecha;

    public Cita() {
    }

    public Cita(Odontologo odontologo, Paciente paciente, String fecha) {
        this.odontologo = odontologo;
        this.paciente = paciente;
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public Odontologo getOdontologo() {
        return odontologo;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public String getFecha() {
        return fecha;
    }
}
