package unab.portafolio.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.Length;

@Entity
public class Medico {
    @Id
    @Column(name = "rutMedico")
    private int rutMedico;
    @NotNull
    @Column(name = "nombreMedico")
    private String nombreMedico;
    @Basic
    @Column(name = "apellidoPaternoMedico")
    private String apellidoPaternoMedico;
    @Basic
    @Column(name = "apellidoMaternoMedico")
    private String apellidoMaternoMedico;

    public int getRutMedico() {
        return rutMedico;
    }

    public void setRutMedico(int rutMedico) {
        this.rutMedico = rutMedico;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getApellidoPaternoMedico() {
        return apellidoPaternoMedico;
    }

    public void setApellidoPaternoMedico(String apellidoPaternoMedico) {
        this.apellidoPaternoMedico = apellidoPaternoMedico;
    }

    public String getApellidoMaternoMedico() {
        return apellidoMaternoMedico;
    }

    public void setApellidoMaternoMedico(String apellidoMaternoMedico) {
        this.apellidoMaternoMedico = apellidoMaternoMedico;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Medico medico = (Medico) o;

        if (rutMedico != medico.rutMedico) return false;
        if (nombreMedico != null ? !nombreMedico.equals(medico.nombreMedico) : medico.nombreMedico != null)
            return false;
        if (apellidoPaternoMedico != null ? !apellidoPaternoMedico.equals(medico.apellidoPaternoMedico) : medico.apellidoPaternoMedico != null)
            return false;
        if (apellidoMaternoMedico != null ? !apellidoMaternoMedico.equals(medico.apellidoMaternoMedico) : medico.apellidoMaternoMedico != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rutMedico;
        result = 31 * result + (nombreMedico != null ? nombreMedico.hashCode() : 0);
        result = 31 * result + (apellidoPaternoMedico != null ? apellidoPaternoMedico.hashCode() : 0);
        result = 31 * result + (apellidoMaternoMedico != null ? apellidoMaternoMedico.hashCode() : 0);
        return result;
    }
}
