package unab.portafolio.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "control", schema = "hospitaldb", catalog = "")
@IdClass(ControlEntityPK.class)
public class ControlEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idControl")
    private int idControl;
    @Basic
    @Column(name = "fechaControl")
    private Date fechaControl;
    @Basic
    @Column(name = "obsControl")
    private String obsControl;
    @Basic
    @Column(name = "fechaSiguienteControl")
    private Date fechaSiguienteControl;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Paciente_rutPaciente")
    private int pacienteRutPaciente;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Paciente_Medico_rutMedico")
    private int pacienteMedicoRutMedico;

    public int getIdControl() {
        return idControl;
    }

    public void setIdControl(int idControl) {
        this.idControl = idControl;
    }

    public Date getFechaControl() {
        return fechaControl;
    }

    public void setFechaControl(Date fechaControl) {
        this.fechaControl = fechaControl;
    }

    public String getObsControl() {
        return obsControl;
    }

    public void setObsControl(String obsControl) {
        this.obsControl = obsControl;
    }

    public Date getFechaSiguienteControl() {
        return fechaSiguienteControl;
    }

    public void setFechaSiguienteControl(Date fechaSiguienteControl) {
        this.fechaSiguienteControl = fechaSiguienteControl;
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

        ControlEntity that = (ControlEntity) o;

        if (idControl != that.idControl) return false;
        if (pacienteRutPaciente != that.pacienteRutPaciente) return false;
        if (pacienteMedicoRutMedico != that.pacienteMedicoRutMedico) return false;
        if (fechaControl != null ? !fechaControl.equals(that.fechaControl) : that.fechaControl != null) return false;
        if (obsControl != null ? !obsControl.equals(that.obsControl) : that.obsControl != null) return false;
        if (fechaSiguienteControl != null ? !fechaSiguienteControl.equals(that.fechaSiguienteControl) : that.fechaSiguienteControl != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idControl;
        result = 31 * result + (fechaControl != null ? fechaControl.hashCode() : 0);
        result = 31 * result + (obsControl != null ? obsControl.hashCode() : 0);
        result = 31 * result + (fechaSiguienteControl != null ? fechaSiguienteControl.hashCode() : 0);
        result = 31 * result + pacienteRutPaciente;
        result = 31 * result + pacienteMedicoRutMedico;
        return result;
    }
}
