package unab.portafolio.model.paciente;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table
@Entity
public class Paciente {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idPaciente")
    private int idPaciente;
    @Column(name = "rutPaciente", nullable = false, unique = true)
    private int rutPaciente;
    @Column(name = "fichaClinica", nullable = false, unique = true)
    private int fichaClinica;
    @Basic
    @Column(name = "nombrePaciente")
    private String nombrePaciente;
    @Basic
    @Column(name = "apellidoPaternoPaciente")
    private String apellidoPaternoPaciente;
    @Basic
    @Column(name = "apellidoMaternoPaciente")
    private String apellidoMaternoPaciente;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Paciente paciente = (Paciente) o;

        if (idPaciente != paciente.idPaciente) return false;
        if (rutPaciente != paciente.rutPaciente) return false;
        if (fichaClinica != paciente.fichaClinica) return false;
        if (nombrePaciente != null ? !nombrePaciente.equals(paciente.nombrePaciente) : paciente.nombrePaciente != null)
            return false;
        if (apellidoPaternoPaciente != null ? !apellidoPaternoPaciente.equals(paciente.apellidoPaternoPaciente) : paciente.apellidoPaternoPaciente != null)
            return false;
        if (apellidoMaternoPaciente != null ? !apellidoMaternoPaciente.equals(paciente.apellidoMaternoPaciente) : paciente.apellidoMaternoPaciente != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPaciente;
        result = 31 * result + rutPaciente;
        result = 31 * result + fichaClinica;
        result = 31 * result + (nombrePaciente != null ? nombrePaciente.hashCode() : 0);
        result = 31 * result + (apellidoPaternoPaciente != null ? apellidoPaternoPaciente.hashCode() : 0);
        result = 31 * result + (apellidoMaternoPaciente != null ? apellidoMaternoPaciente.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "idPaciente=" + idPaciente +
                ", rutPaciente=" + rutPaciente +
                ", fichaClinica=" + fichaClinica +
                ", nombrePaciente='" + nombrePaciente + '\'' +
                ", apellidoPaternoPaciente='" + apellidoPaternoPaciente + '\'' +
                ", apellidoMaternoPaciente='" + apellidoMaternoPaciente + '\'' +
                '}';
    }
}
