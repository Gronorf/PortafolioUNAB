package unab.portafolio.model.rol;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table
@Entity
public class Rol {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idRol", nullable = false)
    private int idRol;

    @Basic
    @Column(name = "nombreRol", nullable = false, length = 250)
    private String nombreRol;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rol rol = (Rol) o;

        if (idRol != rol.idRol) return false;
        if (nombreRol != null ? !nombreRol.equals(rol.nombreRol) : rol.nombreRol != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRol;
        result = 31 * result + (nombreRol != null ? nombreRol.hashCode() : 0);
        return result;
    }
}
