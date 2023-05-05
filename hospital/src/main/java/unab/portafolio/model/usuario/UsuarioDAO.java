package unab.portafolio.model.usuario;

import unab.portafolio.dao.DAO;

public class UsuarioDAO extends DAO<Usuario> {
    @Override
    public String getNombreModelo() {
        return "Usuario";
    }
}
