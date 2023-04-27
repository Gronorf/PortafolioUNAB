package unab.portafolio.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class ControlEntityPK implements Serializable {
    @Column(name = "idControl")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idControl;
    @Column(name = "Paciente_rutPaciente")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pacienteRutPaciente;
    @Column(name = "Paciente_Medico_rutMedico")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pacienteMedicoRutMedico;

    public int getIdControl() {
        return idControl;
    }

    public void setIdControl(int idControl) {
        this.idControl = idControl;
    }

    public int getPacienteRutPaciente() {
        return pacienteRutPaciente;
    }

    public void setPacienteRutPaciente(int pacienteRutPaciente) {
        this.pacienteRutPaciente = pacienteRutPaciente;
    }

    public int getPacienteMedicoRutMedico() {
        return pacienteMedicoRutMedico;
    }

    public void setPacienteMedicoRutMedico(int pacienteMedicoRutMedico) {
        this.pacienteMedicoRutMedico = pacienteMedicoRutMedico;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ControlEntityPK that = (ControlEntityPK) o;

        if (idControl != that.idControl) return false;
        if (pacienteRutPaciente != that.pacienteRutPaciente) return false;
        if (pacienteMedicoRutMedico != that.pacienteMedicoRutMedico) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idControl;
        result = 31 * result + pacienteRutPaciente;
        result = 31 * result + pacienteMedicoRutMedico;
        return result;
    }
}
