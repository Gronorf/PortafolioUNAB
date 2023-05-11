package unab.portafolio.model.usuario;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


/*Mediante la librería Lombok podemos utilizar
las anotaciones @Getter y @Setter para generar
el encapsulamiento de las entidades.*/

@Getter
@Setter
@Entity
public class Usuario {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idusuario")
    private int idusuario;
    @Basic
    @Column(name = "nombreUsuario")
    private String nombreUsuario;
    @Basic
    @Column(name = "emailUsuario")
    private String emailUsuario;
    @Basic
    @Column(name = "claveUsuario")
    private String claveUsuario;
    @Basic
    @Column(name = "rolUsuario")
    private String rolUsuario;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuario usuario = (Usuario) o;

        if (idusuario != usuario.idusuario) return false;
        if (nombreUsuario != null ? !nombreUsuario.equals(usuario.nombreUsuario) : usuario.nombreUsuario != null)
            return false;
        if (emailUsuario != null ? !emailUsuario.equals(usuario.emailUsuario) : usuario.emailUsuario != null)
            return false;
        if (claveUsuario != null ? !claveUsuario.equals(usuario.claveUsuario) : usuario.claveUsuario != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idusuario;
        result = 31 * result + (nombreUsuario != null ? nombreUsuario.hashCode() : 0);
        result = 31 * result + (emailUsuario != null ? emailUsuario.hashCode() : 0);
        result = 31 * result + (claveUsuario != null ? claveUsuario.hashCode() : 0);
        return result;
    }

    public Usuario(String nombreUsuario, String emailUsuario, String claveUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.emailUsuario = emailUsuario;
        this.claveUsuario = claveUsuario;
    }

    public Usuario() {
    }
}
