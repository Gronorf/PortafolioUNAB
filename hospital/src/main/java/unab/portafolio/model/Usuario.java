package unab.portafolio.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Usuario {

    // Variables que almacena la clase Usuario.
    @Id
    @GeneratedValue
    private int idUsuario;

    @Column(name = "nombreUsuario", nullable = false, unique = true)
    private String nombreUsuario;

    @Column(name = "claveUsuario", nullable = false, unique = false)
    private String claveUsuario;
    @Column(name = "tipoUsuario", nullable = false, unique = false)
    private String tipoUsuario;

    // Constructores de la clase.
    public Usuario(String nombreUsuario, String claveUsuario, String tipoUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.claveUsuario = claveUsuario;
        this.tipoUsuario = tipoUsuario;
    }

    public Usuario() {
    }

    // Getter y Setters.
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getClaveUsuario() {
        return claveUsuario;
    }

    public void setClaveUsuario(String claveUsuario) {
        this.claveUsuario = claveUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    // Método toString().
    @Override
    public String toString() {
        return "Usuario{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", claveUsuario='" + claveUsuario + '\'' +
                ", tipoUsuario='" + tipoUsuario + '\'' +
                '}';
    }
}
