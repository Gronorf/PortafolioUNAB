package unab.portafolio.model.paciente;

import jakarta.persistence.*;

@Entity
@Table(name = "paciente", schema = "hospitaldb", catalog = "")
@IdClass(PacienteEntityPK.class)
public class PacienteEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "rutPaciente")
    private int rutPaciente;
    @Basic
    @Column(name = "fechaClinica")
    private int fechaClinica;
    @Basic
    @Column(name = "nombrePaciente")
    private String nombrePaciente;
    @Basic
    @Column(name = "apellidoPaternoPaciente")
    private String apellidoPaternoPaciente;
    @Basic
    @Column(name = "apellidoMaternoPaciente")
    private String apellidoMaternoPaciente;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Medico_rutMedico")
    private int medicoRutMedico;

    public int getRutPaciente() {
        return rutPaciente;
    }

    public void setRutPaciente(int rutPaciente) {
        this.rutPaciente = rutPaciente;
    }

    public int getFechaClinica() {
        return fechaClinica;
    }

    public void setFechaClinica(int fechaClinica) {
        this.fechaClinica = fechaClinica;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getApellidoPaternoPaciente() {
        return apellidoPaternoPaciente;
    }

    public void setApellidoPaternoPaciente(String apellidoPaternoPaciente) {
        this.apellidoPaternoPaciente = apellidoPaternoPaciente;
    }

    public String getApellidoMaternoPaciente() {
        return apellidoMaternoPaciente;
    }

    public void setApellidoMaternoPaciente(String apellidoMaternoPaciente) {
        this.apellidoMaternoPaciente = apellidoMaternoPaciente;
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

        PacienteEntity that = (PacienteEntity) o;

        if (rutPaciente != that.rutPaciente) return false;
        if (fechaClinica != that.fechaClinica) return false;
        if (medicoRutMedico != that.medicoRutMedico) return false;
        if (nombrePaciente != null ? !nombrePaciente.equals(that.nombrePaciente) : that.nombrePaciente != null)
            return false;
        if (apellidoPaternoPaciente != null ? !apellidoPaternoPaciente.equals(that.apellidoPaternoPaciente) : that.apellidoPaternoPaciente != null)
            return false;
        if (apellidoMaternoPaciente != null ? !apellidoMaternoPaciente.equals(that.apellidoMaternoPaciente) : that.apellidoMaternoPaciente != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rutPaciente;
        result = 31 * result + fechaClinica;
        result = 31 * result + (nombrePaciente != null ? nombrePaciente.hashCode() : 0);
        result = 31 * result + (apellidoPaternoPaciente != null ? apellidoPaternoPaciente.hashCode() : 0);
        result = 31 * result + (apellidoMaternoPaciente != null ? apellidoMaternoPaciente.hashCode() : 0);
        result = 31 * result + medicoRutMedico;
        return result;
    }
}
