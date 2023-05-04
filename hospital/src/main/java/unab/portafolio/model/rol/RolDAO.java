package unab.portafolio.model.rol;

import unab.portafolio.dao.DAO;

public class RolDAO extends DAO<Rol> {
    @Override
    public String getNombreModelo() {

        return "Rol";
    }
}
