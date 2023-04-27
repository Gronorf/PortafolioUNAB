package unab.portafolio.model.paciente;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class PacienteEntityPK implements Serializable {
    @Column(name = "rutPaciente")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rutPaciente;
    @Column(name = "Medico_rutMedico")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int medicoRutMedico;

    public int getRutPaciente() {
        return rutPaciente;
    }

    public void setRutPaciente(int rutPaciente) {
        this.rutPaciente = rutPaciente;
    }

    public int getMedicoRutMedico() {
        return medicoRutMedico;
    }

    public void setMedicoRutMedico(int medicoRutMedico) {
        this.medicoRutMedico = medicoRutMedico;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PacienteEntityPK that = (PacienteEntityPK) o;

        if (rutPaciente != that.rutPaciente) return false;
        if (medicoRutMedico != that.medicoRutMedico) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rutPaciente;
        result = 31 * result + medicoRutMedico;
        return result;
    }
}
