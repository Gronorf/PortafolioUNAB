package unab.portafolio.model.medico;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "medico")
public class Medico {

    @Id
    @Column(name = "idMedico")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMedico;

    @Column(name = "rutMedico")
    private int rutMedico;

    @NotNull
    @Column(name = "nombreMedico")
    private String nombreMedico;

    @Column(name = "apellidoPaternoMedico")
    private String apellidoPaternoMedico;

    @Column(name = "apellidoMaternoMedico")
    private String apellidoMaternoMedico;


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


    public Medico(int rutMedico, String nombreMedico, String apellidoPaternoMedico, String apellidoMaternoMedico) {
        this.rutMedico = rutMedico;
        this.nombreMedico = nombreMedico;
        this.apellidoPaternoMedico = apellidoPaternoMedico;
        this.apellidoMaternoMedico = apellidoMaternoMedico;
    }
    public Medico() {
    }

    @Override
    public String toString() {
        return "Medico{" +
                "idMedico=" + idMedico +
                ", rutMedico=" + rutMedico +
                ", nombreMedico='" + nombreMedico + '\'' +
                ", apellidoPaternoMedico='" + apellidoPaternoMedico + '\'' +
                ", apellidoMaternoMedico='" + apellidoMaternoMedico + '\'' +
                '}';
    }
}
